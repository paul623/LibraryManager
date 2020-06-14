package com.paul.javaweb.book.controller;

import com.paul.javaweb.book.entity.Book;
import com.paul.javaweb.book.entity.BookStatus;
import com.paul.javaweb.book.entity.Lend;
import com.paul.javaweb.book.entity.ReaderCard;
import com.paul.javaweb.book.mapper.CardTypeMapper;
import com.paul.javaweb.book.service.BookService;
import com.paul.javaweb.book.service.CardTypeService;
import com.paul.javaweb.book.service.LendService;
import com.paul.javaweb.book.utils.DateHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LendController {
    @Autowired
    LendService lendService;
    @Autowired
    BookService bookService;
    @Autowired
    CardTypeService cardTypeService;
    @RequestMapping("/lendbook.html")
    public ModelAndView bookLend(HttpServletRequest request){
        long bookId=Integer.parseInt(request.getParameter("bookId"));
        Book book=bookService.getBook(bookId);
        ModelAndView modelAndView=new ModelAndView("admin_book_lend");
        modelAndView.addObject("book",book);
        return modelAndView;
    }

    @RequestMapping("/lendbookdo.html")
    public String bookLendDo(HttpServletRequest request, RedirectAttributes redirectAttributes, int readerId){
        long bookId=Integer.parseInt(request.getParameter("id"));
        boolean lendsucc=lendService.bookLend(bookId,readerId);
        if (lendsucc){
            redirectAttributes.addFlashAttribute("succ", "图书借阅成功！");
            return "redirect:/allbooks.html";
        }else {
            redirectAttributes.addFlashAttribute("succ", "图书借阅成功！");
            return "redirect:/allbooks.html";
        }


    }

    @RequestMapping("/returnbook.html")
    public String bookReturn(HttpServletRequest request,RedirectAttributes redirectAttributes){
        long bookId=Integer.parseInt(request.getParameter("bookId"));
        boolean retSucc=lendService.bookReturn(bookId);
        if (retSucc){
            redirectAttributes.addFlashAttribute("succ", "图书归还成功！");
            return "redirect:/allbooks.html";
        }
        else {
            redirectAttributes.addFlashAttribute("error", "图书归还失败！");
            return "redirect:/allbooks.html";
        }
    }


    private List<Book> getBooksByLendList(List<Lend> lends){
        List<Book> books=new ArrayList<>();
        for(Lend i:lends){
            Book book=bookService.getBook(i.getBookId());
            if(book==null){
                books.add(new Book());
            }else {
                books.add(book);
            }
        }
        return books;
    }
    @RequestMapping("/lendlist.html")
    public ModelAndView lendList(){
        List<Lend> lends=lendService.lendList();
        ModelAndView modelAndView=new ModelAndView("admin_lend_list");
        modelAndView.addObject("list",lends);
        modelAndView.addObject("books",getBooksByLendList(lends));

        return modelAndView;
    }
    @RequestMapping("/mylend.html")
    public ModelAndView myLend(HttpServletRequest request){
        ReaderCard readerCard=(ReaderCard) request.getSession().getAttribute("readercard");
        ModelAndView modelAndView=new ModelAndView("reader_lend_list");
        List<Lend> userLendList=lendService.myLendList(readerCard.getReaderId());
        modelAndView.addObject("books",getBooksByLendList(userLendList));
        modelAndView.addObject("list",lendService.myLendList(readerCard.getReaderId()));
        modelAndView.addObject("timeLong",getBookStatus(userLendList,readerCard));
        return modelAndView;
    }
    public List<BookStatus> getBookStatus(List<Lend> lends,ReaderCard readerCard){
        List<BookStatus> bookStatuses=new ArrayList<>();
        int user_long_time=cardTypeService.getCardType(readerCard).getDay_long();
        for(Lend i:lends){
            //归还时间为空，则代表未还
            if(i.getBackDate()==null){
                //计算从借书到现在已经多长时间
                int day_long=DateHelper.getDifferDay(i.getLendDate());
               if(day_long>user_long_time){
                   bookStatuses.add(new BookStatus("超时","已经超时:"+(day_long-user_long_time)+"天"));
               }else {
                   bookStatuses.add(new BookStatus("未还","还剩:"+(user_long_time-day_long)+"天"));
               }
            }else {
                //计算总周期多长时间
                int day_long=DateHelper.getDifferDay(i.getLendDate(),i.getBackDate());
                if(day_long>user_long_time){
                    bookStatuses.add(new BookStatus("已还(超时)","总时长："+Math.abs(day_long-user_long_time)+"天"));
                }else {
                    bookStatuses.add(new BookStatus("已还","总时长："+day_long+"天"));
                }
            }
        }
        return bookStatuses;
    }

}
