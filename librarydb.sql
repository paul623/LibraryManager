/*
 Navicat Premium Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 50519
 Source Host           : localhost:3306
 Source Schema         : librarydb

 Target Server Type    : MySQL
 Target Server Version : 50519
 File Encoding         : 65001

 Date: 14/06/2020 11:12:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `admin_id` int(11) NOT NULL,
  `password` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (20200611, '123456');

-- ----------------------------
-- Table structure for book_info
-- ----------------------------
DROP TABLE IF EXISTS `book_info`;
CREATE TABLE `book_info`  (
  `book_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `publish` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ISBN` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `introduction` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `language` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` decimal(10, 2) NOT NULL,
  `pubdate` date NULL DEFAULT NULL,
  `class_id` int(11) NULL DEFAULT NULL,
  `pressmark` int(11) NULL DEFAULT NULL,
  `state` smallint(6) NULL DEFAULT NULL,
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 50000026 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of book_info
-- ----------------------------
INSERT INTO `book_info` VALUES (10000001, '大雪中的山庄', '东野圭吾 ', '北京十月文艺出版社', '9787530216835', '东野圭吾长篇小说杰作，中文简体首次出版。 一出没有剧本的舞台剧，为什么能让七个演员赌上全部人生.东野圭吾就是有这样过人的本领，能从充满悬念的案子写出荡气回肠的情感，在极其周密曲折的同时写出人性的黑暗与美丽。 一家与外界隔绝的民宿里，七个演员被要求住满四天，接受导演的考验，但不断有人失踪。难道这并非正常排练，而是有人布下陷阱要杀他们。 那时候我开始喜欢上戏剧和音乐，《大雪中的山庄》一书的灵感就来源于此。我相信这次的诡计肯定会让人大吃一惊。——东野圭吾', '中文', 35.00, '2017-06-01', 9, 13, 0);
INSERT INTO `book_info` VALUES (10000003, '三生三世 十里桃花', '唐七公子 ', '沈阳出版社', '9787544138000', '三生三世，她和他，是否注定背负一段纠缠的姻缘？\r\n三生三世，她和他，是否终能互许一个生生世世的承诺？', '中文', 26.80, '2009-01-06', 7, 2, 1);
INSERT INTO `book_info` VALUES (10000004, '何以笙箫默', '顾漫 ', '朝华出版社', '9787505414709', '一段年少时的爱恋，牵出一生的纠缠。大学时代的赵默笙阳光灿烂，对法学系大才子何以琛一见倾心，开朗直率的她拔足倒追，终于使才气出众的他为她停留驻足。然而，不善表达的他终于使她在一次伤心之下远走他乡……', '中文', 15.00, '2007-04-03', 7, 2, 1);
INSERT INTO `book_info` VALUES (10000005, '11处特工皇妃', '潇湘冬儿', '江苏文艺出版社', '9787539943893', '《11处特工皇妃(套装上中下册)》内容简介：她是国安局军情十一处惊才绝艳的王牌军师——收集情报、策划部署、进不友好国家布置暗杀任务……她运筹帷幄之中，决胜于千里之外，堪称军情局大厦的定海神针。', '中文', 74.80, '2011-05-05', 7, 2, 1);
INSERT INTO `book_info` VALUES (10000006, '人类简史', '[以色列] 尤瓦尔·赫拉利 ', '中信出版社', '9787508647357', '十万年前，地球上至少有六种不同的人\r\n但今日，世界舞台为什么只剩下了我们自己？\r\n从只能啃食虎狼吃剩的残骨的猿人，到跃居食物链顶端的智人，\r\n从雪维洞穴壁上的原始人手印，到阿姆斯壮踩上月球的脚印，\r\n从认知革命、农业革命，到科学革命、生物科技革命，\r\n我们如何登上世界舞台成为万物之灵的？\r\n从公元前1776年的《汉摩拉比法典》，到1776年的美国独立宣言，\r\n从帝国主义、资本主义，到自由主义、消费主义，\r\n从兽欲，到物欲，从兽性、人性，到神性，\r\n我们了解自己吗？我们过得更快乐吗？\r\n我们究竟希望自己得到什么、变成什么？', '英文', 68.00, '2014-11-01', 11, 3, 1);
INSERT INTO `book_info` VALUES (10000007, '明朝那些事儿（1-9）', '当年明月 ', '中国海关出版社', '9787801656087', '《明朝那些事儿》讲述从1344年到1644年，明朝三百年间的历史。作品以史料为基础，以年代和具体人物为主线，运用小说的笔法，对明朝十七帝和其他王公权贵和小人物的命运进行全景展示，尤其对官场政治、战争、帝王心术着墨最多。作品也是一部明朝政治经济制度、人伦道德的演义。', '中文', 358.20, '2009-04-06', 11, 3, 0);
INSERT INTO `book_info` VALUES (10000010, '经济学原理（上下）', '[美] 曼昆 ', '机械工业出版社', '9787111126768', '此《经济学原理》的第3版把较多篇幅用于应用与政策，较少篇幅用于正规的经济理论。书中主要从供给与需求、企业行为与消费者选择理论、长期经济增长与短期经济波动以及宏观经济政策等角度深入浅出地剖析了经济学家们的世界观。', '英文', 88.00, '2003-08-05', 6, 5, 1);
INSERT INTO `book_info` VALUES (50000004, '方向', '马克-安托万·马修 ', '后浪丨北京联合出版公司', '9787020125265', '《方向》即便在马修的作品中也算得最独特的：不着一字，尽得风流。原作本无一字，标题只是一个→，出版时才加了个书名Sens——既可以指“方向”，也可以指“意义”。 《方向》没有“字”，但有自己的语言——请读者在尽情释放想象力和独立思考之余，破解作者的密码，听听作者对荒诞的看法。', '中文', 99.80, '2017-04-01', 9, 13, 1);
INSERT INTO `book_info` VALUES (50000005, '画的秘密', '马克-安托万·马修 ', '北京联合出版公司·后浪出版公司', '9787550265608', '一本关于友情的疗伤图像小说，直击人内心最为隐秘的情感。 一部追寻艺术的纸上悬疑电影，揭示命运宇宙中奇诡的真相。 ★ 《画的秘密》荣获欧洲第二大漫画节“瑞士谢尔漫画节最佳作品奖”。 作者曾两度夺得安古兰国际漫画节重要奖项。 ★ 《画的秘密》是一部罕见的、结合了拼贴、镜像、3D等叙事手法的实验型漫画作品。作者巧妙地调度光线、纬度、时间、记忆，在一个悬念重重又温情治愈的故事中，注入了一个有关命运的哲学议题。', '中文', 60.00, '2016-01-01', 9, 13, 1);
INSERT INTO `book_info` VALUES (50000007, '造彩虹的人', '东野圭吾 ', '北京十月文艺出版社', '9787530216859', '其实每个人身上都会发光，但只有纯粹渴求光芒的人才能看到。 从那一刻起，人生会发生奇妙的转折。 ------------------------------------------------------------------------------------------------------ 功一高中退学后无所事事，加入暴走族消极度日；政史备战高考却无法集中精神，几近崩溃；辉美因家庭不和对生活失去勇气，决定自杀。面对糟糕的人生，他们无所适从，直到一天夜里，一道如同彩虹的光闯进视野。 凝视着那道光，原本几乎要耗尽的气力，源源不断地涌了出来。一切又开始充满希望。打起精神来，不能输。到这儿来呀，快来呀——那道光低声呼唤着。 他们追逐着呼唤，到达一座楼顶，看到一个人正用七彩绚烂的光束演奏出奇妙的旋律。 他们没想到，这一晚看到的彩虹，会让自己的人生彻底转...', '中文', 39.50, '2017-06-01', 9, 13, 1);
INSERT INTO `book_info` VALUES (50000008, '控方证人', '阿加莎·克里斯蒂 ', '新星出版社', '9787513325745', '经典同名话剧六十年常演不衰； 比利•怀尔德执导同名电影，获奥斯卡金像奖六项提名！ 阿加莎对神秘事物的向往大约来自于一种女性祖先的遗传，在足不出户的生活里，生出对世界又好奇又恐惧的幻想。 ——王安忆 伦纳德•沃尔被控谋杀富婆艾米丽以图染指其巨额遗产，他却一再表明自己的无辜。伦纳德的妻子是唯一能够证明他无罪的证人，却以控方证人的身份出庭指证其确实犯有谋杀罪。伦纳德几乎陷入绝境，直到一个神秘女人的出现…… 墙上的犬形图案；召唤死亡的收音机；蓝色瓷罐的秘密；一只疯狂的灰猫……十一篇神秘的怪谈，最可怕的不是“幽灵”，而是你心中的魔鬼。', '中文', 35.00, '2017-05-01', 9, 12, 1);
INSERT INTO `book_info` VALUES (50000009, '少有人走的路', 'M·斯科特·派克 ', '吉林文史出版社', '9787807023777', '这本书处处透露出沟通与理解的意味，它跨越时代限制，帮助我们探索爱的本质，引导我们过上崭新，宁静而丰富的生活；它帮助我们学习爱，也学习独立；它教诲我们成为更称职的、更有理解心的父母。归根到底，它告诉我们怎样找到真正的自我。 正如开篇所言：人生苦难重重。M·斯科特·派克让我们更加清楚：人生是一场艰辛之旅，心智成熟的旅程相当漫长。但是，他没有让我们感到恐惧，相反，他带领我们去经历一系列艰难乃至痛苦的转变，最终达到自我认知的更高境界。', '中文', 26.00, '2007-01-01', 9, 12, 1);
INSERT INTO `book_info` VALUES (50000010, '追寻生命的意义', '[奥] 维克多·弗兰克 ', '新华出版社', '9787501162734', '《追寻生命的意义》是一个人面对巨大的苦难时，用来拯救自己的内在世界，同时也是一个关于每个人存在的价值和能者多劳们生存的社会所应担负职责的思考。本书对于每一个想要了解我们这个时代的人来说，都是一部必不可少的读物。这是一部令人鼓舞的杰作……他是一个不可思议的人，任何人都可以从他无比痛苦的经历中，获得拯救自己的经验……高度推荐。', '中文', 12.00, '2003-01-01', 9, 16, 1);
INSERT INTO `book_info` VALUES (50000011, '高等数学', '同济大学数学系', '高等教育出版社', '9787040396621', '高数下册，大学必修啊', '中文', 33.50, '2014-07-01', 13, 19, 1);
INSERT INTO `book_info` VALUES (50000012, '祈念守护人', '东野圭吾', '南海出版社', '9787544299015', '《祈念守护人》是日本作家东野圭吾2020年全新长篇小说，娓娓讲述一段穿越时间又温暖奇幻的动人故事。\r\n\r\n《祈念守护人》内容简介：\r\n\r\n离东京一个多小时车程的小镇，有座古老的月乡神社，院落深处有一棵巨大的古树。传说只要向它祈念，愿望就会实现。\r\n\r\n祈念规则如下：1、限一人祈念；2、限深夜进行，事先须预约；3、不限许愿内容，即便是希望别人去死。\r\n\r\n二十出头的玲斗过得一团糟，正走投无路时，一个神秘人出巨资救了他，条件是要他去守护古树。\r\n\r\n玲斗对那棵树一无所知，也不相信传说。如果愿望可以实现，想要的当然还是钱哗啦哗啦往家里灌！他忍不住笑了。可他惊讶地发现，来祈念的人很多，态度还都庄重得可怕。一天深夜，玲斗偶然间走近古树，听到树里传来一阵奇怪的哼唱声。\r\n\r\n迷茫而平凡的人，这世上到处都是。只要向那棵树祈念，无论什么愿望都能实现，真的会有这样的奇迹哦！', '中文', 59.00, '2020-06-01', 9, 19, 0);
INSERT INTO `book_info` VALUES (50000014, '人间失格', '太宰治', '同济大学出版社', '9787530216838', '《人间失格》（又名《丧失为人的资格》）日本小说家太宰治创作的中篇小说，发表于1948年，是一部半自传体的小说。\r\n《人间失格》以“我”看到叶藏的三张照片后的感想开头，中间是叶藏的三篇手记，而三篇手记与照片对应，分别介绍了叶藏幼年、青年和壮年时代的经历，描述了叶藏是如何一步一步走向丧失为人资格的道路的。', '中文', 38.00, '2009-01-02', 9, 1, 1);
INSERT INTO `book_info` VALUES (50000015, '半小时漫画科学史', '陈磊.半小时漫画团队', '文汇出版社', '9787549631698', '　通过手绘漫画的形式，陈磊（笔名：二混子）及其半小时漫画团队向读者呈现了从古希腊时期到牛顿时代，科学萌芽与发展的过程。\r\n\r\n　　毕达哥拉斯为了坚持自己的理论将学生踹进河里；\r\n\r\n　　布鲁诺不是为了日心说，而是为了自己的宗教信仰才被烧死；\r\n\r\n　　开普勒是个超级近视眼，并且与他师父第谷面和心不和；\r\n\r\n　　牛顿热衷炼金术，还是非常虔诚的教徒……\r\n\r\n \r\n\r\n　　不摆吓人的艰深理论，没有沉闷的史实堆砌，半小时看各路科学巨人爆笑掐架，让你对那些耳熟能详的科学家与科学故事耳目一新。\r\n\r\n \r\n\r\n　　翻开本书，在嘻嘻哈哈中读懂人类如何从蒙昧走向理性。', '中文', 42.00, '2020-05-01', 9, 19, 1);
INSERT INTO `book_info` VALUES (50000021, '古代中国：中华文明的起源', '马伯乐', '北京理工大学出版社', '9787568283168', '在人类文明史上的文明古国中，唯有中华民族一直延续着、创造着五千多年有文字记载的连绵不断的文明历史，为人类文明与进步做出不可磨灭的贡献。被誉为“古代中国史的奇才 ”的法国著名汉学家马伯乐，深入接触中国各阶层人士，了解他们的社会和习俗，严格使用当地人提供的信息资源，携带了旅行家在中国行走必备的参考书——中国地方志，以及欧洲特藏中被收入并被远东的出版物中已经发表的文物，撰写了这部经典巨著《古代中国》，作者综合运用语言学、文献学、人类学、社会学等的方法，广泛采用神话、传说、金石、考古的材料，构建起秦以前的中华文明发展图景。\r\n\r\n该书出版于1927年，出版后就引起国内学者的关注，陈训慈在《史学杂志》上对马伯乐的《古代中国》做的短评是国内较早的，突出了该书在社会研究和文化发展方面的特点，表明该书对于向国外推荐中国文化功不可没。贺昌群判定，马伯乐的《古代中国》“由上古而至秦之统一，融会贯通，极具新裁，较之夏德《中国上古史》之仅以帝王年代为次者，远胜多多”，雷海宗评定“加氏著作的价值不及马氏”。1944年，马伯乐在德国纳粹集中营病故，中国语言学家高明凯师从马伯乐攻读语言学，在马伯乐去世时，高名凯发短文纪念其导师:“学问渊博，于中国古史、语言、宗教、天文、哲学、术数无不精通，所著《古代中国》曾获儒莲奖”，1978年弗兰克•基尔曼根据1955年法文第二版，翻译出版《古代中国》英文版，再次引发了欧美汉学界对此书学术和利用价值的探讨。', '中文', 116.00, '1990-06-13', 11, 2, 1);
INSERT INTO `book_info` VALUES (50000022, '优雅是种力量', '晓雪', '百花洲文艺出版社', '9787550037342', '暌违八年，中国“时尚女魔头”晓雪再度分享优雅心经\r\n从外在穿搭到内在修养，从才情修炼到不畏岁月\r\n晓雪真诚与你分享，给闺蜜的成长情书\r\n\r\n一个女人懂穿，才懂生活；一个女人爱美，才能有更好的能力去爱别人。\r\n\r\n穿得繁复，永远不如穿得简单。买得好是加法，穿得好是减法。\r\n\r\n读书，让一个女人心里有底气；旅行，让一个女人心界宽广；情迷艺术，让一个女人心里有美、有柔情、有万千故事。', '中文', 25.00, '2009-11-02', 10, 6, 1);
INSERT INTO `book_info` VALUES (50000023, '护肤全书', '庆田朋子', '江苏凤凰文艺出版社', '9787559410931', '庆田朋子 Keida Tomoko\r\n\r\n \r\n\r\n医学博士、日本皮肤科学会认证的皮肤科专家、日本激光医学会认证的激光专家。银座KS-SKIN美容院院长。\r\n\r\n1999年毕业于东京女子医科大学医学部，同年进入该大学皮肤科学教研室。在圣母医院皮肤科工作一段时间后，于2006年开办有乐町西武KS-SKIN美容院。2011年开办现在的银座KS-SKIN美容院。将*的医疗器械和注入疗法相结合，实现了“不用动刀就能快乐逆转衰老”，受到很多客户的深度信赖。\r\n\r\n庆田老师对皮肤的功能、有效的美容护肤方法、护肤习惯等方面的讲解通俗易懂，因而大受欢迎，常活跃于电视、杂志、网络等媒体。\r\n\r\n此外，将通过学会、论文等媒介不断学习到的皮肤科学新知识传递给广大海内外读者', '中文', 45.00, '2019-01-02', 16, 2, 1);
INSERT INTO `book_info` VALUES (50000024, '二级建造师 2020教材 ', '建筑科学研究院', '中国建筑工业出版社', '9787112243235', '职称考试', '中文', 42.00, '2020-02-12', 18, 2, 1);
INSERT INTO `book_info` VALUES (50000025, '你当像鸟飞往你的山', '塔拉 · 韦斯特弗', '南海出版公司', '9787544276986', '人们只看到我的与众不同：一个十七岁前从未踏入教室的大山女孩，却戴上一顶学历的高帽，熠熠生辉。\r\n\r\n只有我知道自己的真面目：我来自一个极少有人能想象的家庭。我的童年由垃圾场的废铜烂铁铸成，那里没有读书声，只有起重机的轰鸣。不上学，不就医，是父亲要我们坚持的忠诚与真理。父亲不允许我们拥有自己的声音，我们的意志是他眼中的恶魔。\r\n\r\n哈佛大学，剑桥大学，哲学硕士，历史博士……我知道，像我这样从垃圾堆里爬出来的无知女孩，能取得如今的成就，应当感激涕零才对。但我丝毫提不起热情。\r\n\r\n我曾怯懦、崩溃、自我怀疑，内心里有什么东西腐烂了，恶臭熏天。\r\n\r\n直到我逃离大山，打开另一个世界。\r\n\r\n那是教育给我的新世界，那是我生命的无限可能。', '中文', 59.00, '2019-11-01', 7, 10, 1);

-- ----------------------------
-- Table structure for card_type
-- ----------------------------
DROP TABLE IF EXISTS `card_type`;
CREATE TABLE `card_type`  (
  `class_state` int(11) NOT NULL,
  `day_long` int(11) NULL DEFAULT NULL COMMENT '借阅时长',
  `type_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`class_state`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of card_type
-- ----------------------------
INSERT INTO `card_type` VALUES (1, 30, '学生');
INSERT INTO `card_type` VALUES (2, 60, '研究生');
INSERT INTO `card_type` VALUES (3, 90, '教职工');
INSERT INTO `card_type` VALUES (4, 180, '老师');

-- ----------------------------
-- Table structure for class_info
-- ----------------------------
DROP TABLE IF EXISTS `class_info`;
CREATE TABLE `class_info`  (
  `class_id` int(11) NOT NULL,
  `class_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`class_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of class_info
-- ----------------------------
INSERT INTO `class_info` VALUES (1, '马克思主义');
INSERT INTO `class_info` VALUES (2, '哲学');
INSERT INTO `class_info` VALUES (3, '社会科学总论');
INSERT INTO `class_info` VALUES (4, '政治法律');
INSERT INTO `class_info` VALUES (5, '军事');
INSERT INTO `class_info` VALUES (6, '经济');
INSERT INTO `class_info` VALUES (7, '文化');
INSERT INTO `class_info` VALUES (8, '语言');
INSERT INTO `class_info` VALUES (9, '文学');
INSERT INTO `class_info` VALUES (10, '艺术');
INSERT INTO `class_info` VALUES (11, '历史地理');
INSERT INTO `class_info` VALUES (12, '自然科学总论');
INSERT INTO `class_info` VALUES (13, ' 数理科学和化学');
INSERT INTO `class_info` VALUES (14, '天文学、地球科学');
INSERT INTO `class_info` VALUES (15, '生物科学');
INSERT INTO `class_info` VALUES (16, '医药、卫生');
INSERT INTO `class_info` VALUES (17, '农业科学');
INSERT INTO `class_info` VALUES (18, '工业技术');
INSERT INTO `class_info` VALUES (19, '交通运输');
INSERT INTO `class_info` VALUES (20, '航空、航天');
INSERT INTO `class_info` VALUES (21, '环境科学');
INSERT INTO `class_info` VALUES (22, '综合');

-- ----------------------------
-- Table structure for lend_list
-- ----------------------------
DROP TABLE IF EXISTS `lend_list`;
CREATE TABLE `lend_list`  (
  `sernum` bigint(20) NOT NULL AUTO_INCREMENT,
  `book_id` bigint(20) NOT NULL,
  `reader_id` int(11) NOT NULL,
  `lend_date` date NULL DEFAULT NULL,
  `back_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`sernum`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20200617 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of lend_list
-- ----------------------------
INSERT INTO `lend_list` VALUES (20200613, 10000001, 1171325415, '2020-06-13', '2020-09-15');
INSERT INTO `lend_list` VALUES (20200614, 10000001, 1171325415, '2020-03-14', NULL);
INSERT INTO `lend_list` VALUES (20200615, 10000007, 1171325415, '2020-06-14', NULL);
INSERT INTO `lend_list` VALUES (20200616, 50000012, 1171325415, '2020-02-14', NULL);

-- ----------------------------
-- Table structure for reader_card
-- ----------------------------
DROP TABLE IF EXISTS `reader_card`;
CREATE TABLE `reader_card`  (
  `reader_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passwd` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `card_state` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`reader_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1171325722 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of reader_card
-- ----------------------------
INSERT INTO `reader_card` VALUES (1171325415, '朱保罗', '123456', 1);
INSERT INTO `reader_card` VALUES (1171325416, '周涛', '111111', 4);
INSERT INTO `reader_card` VALUES (1171325613, '江苏省淮安市阿斯顿', '222222', 1);
INSERT INTO `reader_card` VALUES (1171325614, '毛兰', '111111', 1);
INSERT INTO `reader_card` VALUES (1171325721, '黄从刚', '222222', 1);

-- ----------------------------
-- Table structure for reader_info
-- ----------------------------
DROP TABLE IF EXISTS `reader_info`;
CREATE TABLE `reader_info`  (
  `reader_id` int(11) NOT NULL,
  `name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `birth` date NULL DEFAULT NULL,
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `telcode` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`reader_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of reader_info
-- ----------------------------
INSERT INTO `reader_info` VALUES (1171325415, '朱保罗', '男', '2020-06-12', '江苏省淮安市', '17851559306');
INSERT INTO `reader_info` VALUES (1171325613, '江苏省淮安市阿斯顿', '女', '1999-01-01', '江苏省淮安市阿斯顿', '22222');
INSERT INTO `reader_info` VALUES (1171325614, '毛兰', '男', '1999-01-01', '江苏省徐州市', '15851732562');
INSERT INTO `reader_info` VALUES (1171325721, '黄从刚', '男', '2020-06-13', '江苏省徐州市', '1956440223');

SET FOREIGN_KEY_CHECKS = 1;
