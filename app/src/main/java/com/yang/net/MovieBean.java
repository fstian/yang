package com.yang.net;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieBean {

    @Override
    public String toString() {
        return "MovieBean{" +
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    /**
     * date : 7月19日 - 7月21日
     * subjects : [{"box":185000000,"new":true,"rank":1,"subject":{"rating":{"max":10,"average":7.4,"details":{"1":204,"3":11046,"2":1379,"5":5375,"4":12975},"stars":"40","min":0},"genres":["剧情","动画","冒险"],"title":"狮子王","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp"},"name_en":"Donald Glover","name":"唐纳德·格洛弗","alt":"https://movie.douban.com/celebrity/1314061/","id":"1314061"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp"},"name_en":"Alfre Woodard","name":"阿尔法·伍达德","alt":"https://movie.douban.com/celebrity/1041159/","id":"1041159"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp"},"name_en":"James Earl Jones","name":"詹姆斯·厄尔·琼斯","alt":"https://movie.douban.com/celebrity/1013800/","id":"1013800"}],"durations":["118分钟"],"collect_count":186347,"mainland_pubdate":"2019-07-12","has_video":false,"original_title":"The Lion King","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp"},"name_en":"Jon Favreau","name":"乔恩·费儒","alt":"https://movie.douban.com/celebrity/1027164/","id":"1027164"}],"pubdates":["2019-07-12(中国大陆)","2019-07-19(美国)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp"},"alt":"https://movie.douban.com/subject/26884354/","id":"26884354"}},{"box":21000000,"new":false,"rank":2,"subject":{"rating":{"max":10,"average":8,"details":{"1":260,"3":12753,"2":1166,"5":14574,"4":27029},"stars":"40","min":0},"genres":["动作","科幻","冒险"],"title":"蜘蛛侠：英雄远征","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467942867.09.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467942867.09.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1467942867.09.webp"},"name_en":"Tom Holland","name":"汤姆·赫兰德","alt":"https://movie.douban.com/celebrity/1325351/","id":"1325351"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1543479263.47.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1543479263.47.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1543479263.47.webp"},"name_en":"Zendaya","name":"赞达亚","alt":"https://movie.douban.com/celebrity/1325576/","id":"1325576"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12737.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12737.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p12737.webp"},"name_en":"Jake Gyllenhaal","name":"杰克·吉伦哈尔","alt":"https://movie.douban.com/celebrity/1048002/","id":"1048002"}],"durations":["127分钟"],"collect_count":371362,"mainland_pubdate":"2019-06-28","has_video":false,"original_title":"Spider-Man: Far from Home","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1435142487.62.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1435142487.62.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1435142487.62.webp"},"name_en":"Jon Watts","name":"乔·沃茨","alt":"https://movie.douban.com/celebrity/1350194/","id":"1350194"}],"pubdates":["2019-06-28(中国大陆)","2019-07-02(美国)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2558293106.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2558293106.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2558293106.webp"},"alt":"https://movie.douban.com/subject/26931786/","id":"26931786"}},{"box":14600000,"new":false,"rank":3,"subject":{"rating":{"max":10,"average":8.8,"details":{"1":35,"3":2771,"2":185,"5":14491,"4":11471},"stars":"45","min":0},"genres":["喜剧","动画","奇幻"],"title":"玩具总动员4","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28603.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28603.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p28603.webp"},"name_en":"Tom Hanks","name":"汤姆·汉克斯","alt":"https://movie.douban.com/celebrity/1054450/","id":"1054450"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6409.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6409.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6409.webp"},"name_en":"Tim Allen","name":"蒂姆·艾伦","alt":"https://movie.douban.com/celebrity/1017911/","id":"1017911"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1397621158.92.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1397621158.92.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1397621158.92.webp"},"name_en":"Annie Potts","name":"安妮·波茨","alt":"https://movie.douban.com/celebrity/1041111/","id":"1041111"}],"durations":["100分钟"],"collect_count":124254,"mainland_pubdate":"2019-06-21","has_video":false,"original_title":"Toy Story 4","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1436104752.86.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1436104752.86.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1436104752.86.webp"},"name_en":"Josh Cooley","name":"乔什·库雷","alt":"https://movie.douban.com/celebrity/1348615/","id":"1348615"}],"pubdates":["2019-06-21(美国)","2019-06-21(中国大陆)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2557284230.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2557284230.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2557284230.webp"},"alt":"https://movie.douban.com/subject/6850547/","id":"6850547"}},{"box":6000000,"new":false,"rank":4,"subject":{"rating":{"max":10,"average":6.6,"details":{"1":14,"3":240,"2":57,"5":38,"4":154},"stars":"35","min":0},"genres":["剧情","惊悚","灾难"],"title":"巨鳄风暴","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13769.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13769.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p13769.webp"},"name_en":"Kaya Scodelario","name":"卡雅·斯考达里奥","alt":"https://movie.douban.com/celebrity/1031178/","id":"1031178"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5095.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5095.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p5095.webp"},"name_en":"Barry Pepper","name":"巴里·佩珀","alt":"https://movie.douban.com/celebrity/1000075/","id":"1000075"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pyItBBL8S8hgcel_avatar_uploaded1413757502.57.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pyItBBL8S8hgcel_avatar_uploaded1413757502.57.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/pyItBBL8S8hgcel_avatar_uploaded1413757502.57.webp"},"name_en":"Ross Anderson","name":"罗斯·安德森","alt":"https://movie.douban.com/celebrity/1343976/","id":"1343976"}],"durations":["87分钟"],"collect_count":630,"mainland_pubdate":"","has_video":false,"original_title":"Crawl","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6763.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6763.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p6763.webp"},"name_en":"Alexandre Aja","name":"亚历山大·阿嘉","alt":"https://movie.douban.com/celebrity/1022791/","id":"1022791"}],"pubdates":["2019-07-12(美国)"],"year":"2019","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2556808379.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2556808379.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2556808379.webp"},"alt":"https://movie.douban.com/subject/30210700/","id":"30210700"}},{"box":5100000,"new":false,"rank":5,"subject":{"rating":{"max":10,"average":6.5,"details":{"1":6,"3":185,"2":40,"5":21,"4":95},"stars":"35","min":0},"genres":["喜剧","奇幻","音乐"],"title":"昨日奇迹","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1524627472.78.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1524627472.78.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1524627472.78.webp"},"name_en":"Himesh Patel","name":"希米什·帕特尔","alt":"https://movie.douban.com/celebrity/1391915/","id":"1391915"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426508419.1.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426508419.1.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1426508419.1.webp"},"name_en":"Lily James","name":"莉莉·詹姆斯","alt":"https://movie.douban.com/celebrity/1318674/","id":"1318674"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386531771.86.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386531771.86.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1386531771.86.webp"},"name_en":"Kate McKinnon","name":"凯特·麦克金农","alt":"https://movie.douban.com/celebrity/1319532/","id":"1319532"}],"durations":["116分钟"],"collect_count":931,"mainland_pubdate":"2019-08-16","has_video":false,"original_title":"Yesterday","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p571.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p571.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p571.webp"},"name_en":"Danny Boyle","name":"丹尼·博伊尔","alt":"https://movie.douban.com/celebrity/1054404/","id":"1054404"}],"pubdates":["2019-05-05(翠贝卡电影节)","2019-06-28(英国)","2019-08-16(中国大陆)"],"year":"2019","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561245949.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561245949.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2561245949.webp"},"alt":"https://movie.douban.com/subject/30165034/","id":"30165034"}},{"box":4000000,"new":false,"rank":6,"subject":{"rating":{"max":10,"average":6.5,"details":{"1":4,"3":96,"2":23,"5":18,"4":43},"stars":"35","min":0},"genres":["喜剧","动作"],"title":"优步危机","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1493202154.34.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1493202154.34.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1493202154.34.webp"},"name_en":"Dave Bautista","name":"戴夫·巴蒂斯塔","alt":"https://movie.douban.com/celebrity/1014003/","id":"1014003"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/pYOeBQ2Cg4Mcel_avatar_uploaded1379240441.22.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/pYOeBQ2Cg4Mcel_avatar_uploaded1379240441.22.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/pYOeBQ2Cg4Mcel_avatar_uploaded1379240441.22.webp"},"name_en":"Kumail Nanjiani","name":"库梅尔·南贾尼","alt":"https://movie.douban.com/celebrity/1334517/","id":"1334517"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405167243.79.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405167243.79.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405167243.79.webp"},"name_en":"Iko Uwais","name":"伊科·乌艾斯","alt":"https://movie.douban.com/celebrity/1319990/","id":"1319990"}],"durations":["105分钟"],"collect_count":220,"mainland_pubdate":"","has_video":false,"original_title":"Stuber","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22421.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22421.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p22421.webp"},"name_en":"Michael Dowse","name":"迈克尔·道斯","alt":"https://movie.douban.com/celebrity/1000624/","id":"1000624"}],"pubdates":["2019-07-12(美国)"],"year":"2019","images":{"small":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2560404028.webp","large":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2560404028.webp","medium":"https://img1.doubanio.com/view/photo/s_ratio_poster/public/p2560404028.webp"},"alt":"https://movie.douban.com/subject/27603782/","id":"27603782"}},{"box":3800000,"new":false,"rank":7,"subject":{"rating":{"max":10,"average":7.8,"details":{"1":87,"3":7917,"2":620,"5":6525,"4":15109},"stars":"40","min":0},"genres":["爱情","奇幻","冒险"],"title":"阿拉丁","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1559529389.85.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1559529389.85.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1559529389.85.webp"},"name_en":"Mena Massoud","name":"梅纳·玛索德","alt":"https://movie.douban.com/celebrity/1377224/","id":"1377224"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1558931683.7.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1558931683.7.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1558931683.7.webp"},"name_en":"Naomi Scott","name":"娜奥米·斯科特","alt":"https://movie.douban.com/celebrity/1325313/","id":"1325313"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p41483.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p41483.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p41483.webp"},"name_en":"Will Smith","name":"威尔·史密斯","alt":"https://movie.douban.com/celebrity/1027138/","id":"1027138"}],"durations":["128分钟"],"collect_count":146687,"mainland_pubdate":"2019-05-24","has_video":false,"original_title":"Aladdin","subtype":"movie","directors":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p47189.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p47189.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p47189.webp"},"name_en":"Guy Ritchie","name":"盖·里奇","alt":"https://movie.douban.com/celebrity/1025148/","id":"1025148"}],"pubdates":["2019-05-24(美国)","2019-05-24(中国大陆)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2553992741.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2553992741.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2553992741.webp"},"alt":"https://movie.douban.com/subject/26891256/","id":"26891256"}},{"box":2660000,"new":false,"rank":8,"subject":{"rating":{"max":10,"average":6.1,"details":{"1":75,"3":1020,"2":364,"5":120,"4":414},"stars":"30","min":0},"genres":["悬疑","惊悚","恐怖"],"title":"安娜贝尔3：回家","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11871.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11871.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p11871.webp"},"name_en":"Vera Farmiga","name":"维拉·法米加","alt":"https://movie.douban.com/celebrity/1053584/","id":"1053584"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1384038922.44.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1384038922.44.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1384038922.44.webp"},"name_en":"Patrick Wilson","name":"帕特里克·威尔森","alt":"https://movie.douban.com/celebrity/1006919/","id":"1006919"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1539836726.88.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1539836726.88.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1539836726.88.webp"},"name_en":"Mckenna Grace","name":"麦肯娜·格瑞丝","alt":"https://movie.douban.com/celebrity/1340538/","id":"1340538"}],"durations":["106分钟"],"collect_count":2498,"mainland_pubdate":"","has_video":false,"original_title":"Annabelle Comes Home","subtype":"movie","directors":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502759226.68.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502759226.68.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1502759226.68.webp"},"name_en":"Gary Dauberman","name":"加里·多伯曼","alt":"https://movie.douban.com/celebrity/1344029/","id":"1344029"}],"pubdates":["2019-06-26(美国)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2556837291.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2556837291.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2556837291.webp"},"alt":"https://movie.douban.com/subject/30207919/","id":"30207919"}},{"box":1599155,"new":false,"rank":9,"subject":{"rating":{"max":10,"average":7.1,"details":{"1":36,"3":318,"2":84,"5":163,"4":398},"stars":"35","min":0},"genres":["剧情","悬疑","惊悚"],"title":"仲夏夜惊魂","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517034183.97.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517034183.97.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517034183.97.webp"},"name_en":"Florence Pugh","name":"佛罗伦斯·珀","alt":"https://movie.douban.com/celebrity/1378921/","id":"1378921"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1425887914.42.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1425887914.42.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1425887914.42.webp"},"name_en":"Jack Reynor","name":"杰克·莱诺","alt":"https://movie.douban.com/celebrity/1326135/","id":"1326135"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1439047149.05.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1439047149.05.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1439047149.05.webp"},"name_en":"Will Poulter","name":"威尔·保尔特","alt":"https://movie.douban.com/celebrity/1004692/","id":"1004692"}],"durations":["147分钟"],"collect_count":1308,"mainland_pubdate":"","has_video":false,"original_title":"Midsommar","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517391630.55.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517391630.55.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1517391630.55.webp"},"name_en":"Ari Aster","name":"阿里·艾斯特","alt":"https://movie.douban.com/celebrity/1387956/","id":"1387956"}],"pubdates":["2019-07-03(美国)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2550004671.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2550004671.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2550004671.webp"},"alt":"https://movie.douban.com/subject/30288638/","id":"30288638"}},{"box":1530000,"new":false,"rank":10,"subject":{"rating":{"max":10,"average":7.2,"details":{"1":47,"3":2886,"2":415,"5":954,"4":2644},"stars":"35","min":0},"genres":["喜剧","动画","冒险"],"title":"爱宠大机密2","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9414.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9414.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p9414.webp"},"name_en":"Patton Oswalt","name":"帕顿·奥斯瓦尔特","alt":"https://movie.douban.com/celebrity/1007015/","id":"1007015"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56350.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56350.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56350.webp"},"name_en":"Kevin Hart","name":"凯文·哈特","alt":"https://movie.douban.com/celebrity/1286162/","id":"1286162"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1452760482.06.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1452760482.06.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1452760482.06.webp"},"name_en":"Harrison Ford","name":"哈里森·福特","alt":"https://movie.douban.com/celebrity/1009238/","id":"1009238"}],"durations":["86分钟"],"collect_count":38984,"mainland_pubdate":"2019-07-05","has_video":false,"original_title":"The Secret Life of Pets 2","subtype":"movie","directors":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29587.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29587.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p29587.webp"},"name_en":"Chris Renaud","name":"克里斯·雷纳德","alt":"https://movie.douban.com/celebrity/1295449/","id":"1295449"}],"pubdates":["2019-06-07(美国)","2019-07-05(中国大陆)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2555923582.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2555923582.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2555923582.webp"},"alt":"https://movie.douban.com/subject/26848167/","id":"26848167"}},{"box":1199000,"new":false,"rank":11,"subject":{"rating":{"max":10,"average":8.6,"details":{"1":792,"3":14979,"2":1733,"5":51258,"4":35392},"stars":"45","min":0},"genres":["动作","科幻","奇幻"],"title":"复仇者联盟4：终局之战","casts":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p56339.webp"},"name_en":"Robert Downey Jr.","name":"小罗伯特·唐尼","alt":"https://movie.douban.com/celebrity/1016681/","id":"1016681"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1359877729.49.webp"},"name_en":"Chris Evans","name":"克里斯·埃文斯","alt":"https://movie.douban.com/celebrity/1017885/","id":"1017885"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p15885.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p15885.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p15885.webp"},"name_en":"Mark Ruffalo","name":"马克·鲁弗洛","alt":"https://movie.douban.com/celebrity/1040505/","id":"1040505"}],"durations":["181分钟"],"collect_count":790470,"mainland_pubdate":"2019-04-24","has_video":false,"original_title":"Avengers: Endgame","subtype":"movie","directors":[{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1555672594.77.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1555672594.77.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1555672594.77.webp"},"name_en":"Anthony Russo","name":"安东尼·罗素","alt":"https://movie.douban.com/celebrity/1321812/","id":"1321812"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1525505053.79.webp"},"name_en":"Joe Russo","name":"乔·罗素","alt":"https://movie.douban.com/celebrity/1320870/","id":"1320870"}],"pubdates":["2019-04-24(中国大陆)","2019-04-26(美国)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2552058346.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2552058346.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2552058346.webp"},"alt":"https://movie.douban.com/subject/26100958/","id":"26100958"}}]
     * title : 豆瓣电影北美票房榜
     */

    private String date;
    private String title;
    private List<SubjectsBean> subjects;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    public static class SubjectsBean {

        @Override
        public String toString() {
            return "SubjectsBean{" +
                    "box=" + box +
                    ", newX=" + newX +
                    ", rank=" + rank +
                    ", subject=" + subject +
                    '}';
        }

        /**
         * box : 185000000
         * new : true
         * rank : 1
         * subject : {"rating":{"max":10,"average":7.4,"details":{"1":204,"3":11046,"2":1379,"5":5375,"4":12975},"stars":"40","min":0},"genres":["剧情","动画","冒险"],"title":"狮子王","casts":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp"},"name_en":"Donald Glover","name":"唐纳德·格洛弗","alt":"https://movie.douban.com/celebrity/1314061/","id":"1314061"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp"},"name_en":"Alfre Woodard","name":"阿尔法·伍达德","alt":"https://movie.douban.com/celebrity/1041159/","id":"1041159"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp"},"name_en":"James Earl Jones","name":"詹姆斯·厄尔·琼斯","alt":"https://movie.douban.com/celebrity/1013800/","id":"1013800"}],"durations":["118分钟"],"collect_count":186347,"mainland_pubdate":"2019-07-12","has_video":false,"original_title":"The Lion King","subtype":"movie","directors":[{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp"},"name_en":"Jon Favreau","name":"乔恩·费儒","alt":"https://movie.douban.com/celebrity/1027164/","id":"1027164"}],"pubdates":["2019-07-12(中国大陆)","2019-07-19(美国)"],"year":"2019","images":{"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp"},"alt":"https://movie.douban.com/subject/26884354/","id":"26884354"}
         */

        private int box;
        @SerializedName("new")
        private boolean newX;
        private int rank;
        private SubjectBean subject;

        public int getBox() {
            return box;
        }

        public void setBox(int box) {
            this.box = box;
        }

        public boolean isNewX() {
            return newX;
        }

        public void setNewX(boolean newX) {
            this.newX = newX;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public SubjectBean getSubject() {
            return subject;
        }

        public void setSubject(SubjectBean subject) {
            this.subject = subject;
        }

        public static class SubjectBean {
            @Override
            public String toString() {
                return "SubjectBean{" +
                        "rating=" + rating +
                        ", title='" + title + '\'' +
                        ", collect_count=" + collect_count +
                        ", mainland_pubdate='" + mainland_pubdate + '\'' +
                        ", has_video=" + has_video +
                        ", original_title='" + original_title + '\'' +
                        ", subtype='" + subtype + '\'' +
                        ", year='" + year + '\'' +
                        ", images=" + images +
                        ", alt='" + alt + '\'' +
                        ", id='" + id + '\'' +
                        ", genres=" + genres +
                        ", casts=" + casts +
                        ", durations=" + durations +
                        ", directors=" + directors +
                        ", pubdates=" + pubdates +
                        '}';
            }

            /**
             * rating : {"max":10,"average":7.4,"details":{"1":204,"3":11046,"2":1379,"5":5375,"4":12975},"stars":"40","min":0}
             * genres : ["剧情","动画","冒险"]
             * title : 狮子王
             * casts : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp"},"name_en":"Donald Glover","name":"唐纳德·格洛弗","alt":"https://movie.douban.com/celebrity/1314061/","id":"1314061"},{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1422444822.86.webp"},"name_en":"Alfre Woodard","name":"阿尔法·伍达德","alt":"https://movie.douban.com/celebrity/1041159/","id":"1041159"},{"avatars":{"small":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp","large":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp","medium":"https://img1.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1490091638.27.webp"},"name_en":"James Earl Jones","name":"詹姆斯·厄尔·琼斯","alt":"https://movie.douban.com/celebrity/1013800/","id":"1013800"}]
             * durations : ["118分钟"]
             * collect_count : 186347
             * mainland_pubdate : 2019-07-12
             * has_video : false
             * original_title : The Lion King
             * subtype : movie
             * directors : [{"avatars":{"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp"},"name_en":"Jon Favreau","name":"乔恩·费儒","alt":"https://movie.douban.com/celebrity/1027164/","id":"1027164"}]
             * pubdates : ["2019-07-12(中国大陆)","2019-07-19(美国)"]
             * year : 2019
             * images : {"small":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp","large":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp","medium":"https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp"}
             * alt : https://movie.douban.com/subject/26884354/
             * id : 26884354
             */



            private RatingBean rating;
            private String title;
            private int collect_count;
            private String mainland_pubdate;
            private boolean has_video;
            private String original_title;
            private String subtype;
            private String year;
            private ImagesBean images;
            private String alt;
            private String id;
            private List<String> genres;
            private List<CastsBean> casts;
            private List<String> durations;
            private List<DirectorsBean> directors;
            private List<String> pubdates;

            public RatingBean getRating() {
                return rating;
            }

            public void setRating(RatingBean rating) {
                this.rating = rating;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getCollect_count() {
                return collect_count;
            }

            public void setCollect_count(int collect_count) {
                this.collect_count = collect_count;
            }

            public String getMainland_pubdate() {
                return mainland_pubdate;
            }

            public void setMainland_pubdate(String mainland_pubdate) {
                this.mainland_pubdate = mainland_pubdate;
            }

            public boolean isHas_video() {
                return has_video;
            }

            public void setHas_video(boolean has_video) {
                this.has_video = has_video;
            }

            public String getOriginal_title() {
                return original_title;
            }

            public void setOriginal_title(String original_title) {
                this.original_title = original_title;
            }

            public String getSubtype() {
                return subtype;
            }

            public void setSubtype(String subtype) {
                this.subtype = subtype;
            }

            public String getYear() {
                return year;
            }

            public void setYear(String year) {
                this.year = year;
            }

            public ImagesBean getImages() {
                return images;
            }

            public void setImages(ImagesBean images) {
                this.images = images;
            }

            public String getAlt() {
                return alt;
            }

            public void setAlt(String alt) {
                this.alt = alt;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public List<String> getGenres() {
                return genres;
            }

            public void setGenres(List<String> genres) {
                this.genres = genres;
            }

            public List<CastsBean> getCasts() {
                return casts;
            }

            public void setCasts(List<CastsBean> casts) {
                this.casts = casts;
            }

            public List<String> getDurations() {
                return durations;
            }

            public void setDurations(List<String> durations) {
                this.durations = durations;
            }

            public List<DirectorsBean> getDirectors() {
                return directors;
            }

            public void setDirectors(List<DirectorsBean> directors) {
                this.directors = directors;
            }

            public List<String> getPubdates() {
                return pubdates;
            }

            public void setPubdates(List<String> pubdates) {
                this.pubdates = pubdates;
            }

            public static class RatingBean {

                @Override
                public String toString() {
                    return "RatingBean{" +
                            "max=" + max +
                            ", average=" + average +
                            ", details=" + details +
                            ", stars='" + stars + '\'' +
                            ", min=" + min +
                            '}';
                }

                /**
                 * max : 10
                 * average : 7.4
                 * details : {"1":204,"3":11046,"2":1379,"5":5375,"4":12975}
                 * stars : 40
                 * min : 0
                 */

                private int max;
                private double average;
                private DetailsBean details;
                private String stars;
                private int min;

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

                public double getAverage() {
                    return average;
                }

                public void setAverage(double average) {
                    this.average = average;
                }

                public DetailsBean getDetails() {
                    return details;
                }

                public void setDetails(DetailsBean details) {
                    this.details = details;
                }

                public String getStars() {
                    return stars;
                }

                public void setStars(String stars) {
                    this.stars = stars;
                }

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }

                public static class DetailsBean {
                    @Override
                    public String toString() {
                        return "DetailsBean{" +
                                "_$1=" + _$1 +
                                ", _$3=" + _$3 +
                                ", _$2=" + _$2 +
                                ", _$5=" + _$5 +
                                ", _$4=" + _$4 +
                                '}';
                    }

                    /**
                     * 1 : 204.0
                     * 3 : 11046.0
                     * 2 : 1379.0
                     * 5 : 5375.0
                     * 4 : 12975.0
                     */

                    @SerializedName("1")
                    private double _$1;
                    @SerializedName("3")
                    private double _$3;
                    @SerializedName("2")
                    private double _$2;
                    @SerializedName("5")
                    private double _$5;
                    @SerializedName("4")
                    private double _$4;

                    public double get_$1() {
                        return _$1;
                    }

                    public void set_$1(double _$1) {
                        this._$1 = _$1;
                    }

                    public double get_$3() {
                        return _$3;
                    }

                    public void set_$3(double _$3) {
                        this._$3 = _$3;
                    }

                    public double get_$2() {
                        return _$2;
                    }

                    public void set_$2(double _$2) {
                        this._$2 = _$2;
                    }

                    public double get_$5() {
                        return _$5;
                    }

                    public void set_$5(double _$5) {
                        this._$5 = _$5;
                    }

                    public double get_$4() {
                        return _$4;
                    }

                    public void set_$4(double _$4) {
                        this._$4 = _$4;
                    }
                }
            }

            public static class ImagesBean {

                @Override
                public String toString() {
                    return "ImagesBean{" +
                            "small='" + small + '\'' +
                            ", large='" + large + '\'' +
                            ", medium='" + medium + '\'' +
                            '}';
                }

                /**
                 * small : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp
                 * large : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp
                 * medium : https://img3.doubanio.com/view/photo/s_ratio_poster/public/p2559742751.webp
                 */

                private String small;
                private String large;
                private String medium;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }
            }

            public static class CastsBean {
                @Override
                public String toString() {
                    return "CastsBean{" +
                            "avatars=" + avatars +
                            ", name_en='" + name_en + '\'' +
                            ", name='" + name + '\'' +
                            ", alt='" + alt + '\'' +
                            ", id='" + id + '\'' +
                            '}';
                }

                /**
                 * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp"}
                 * name_en : Donald Glover
                 * name : 唐纳德·格洛弗
                 * alt : https://movie.douban.com/celebrity/1314061/
                 * id : 1314061
                 */

                private AvatarsBean avatars;
                private String name_en;
                private String name;
                private String alt;
                private String id;

                public AvatarsBean getAvatars() {
                    return avatars;
                }

                public void setAvatars(AvatarsBean avatars) {
                    this.avatars = avatars;
                }

                public String getName_en() {
                    return name_en;
                }

                public void setName_en(String name_en) {
                    this.name_en = name_en;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAlt() {
                    return alt;
                }

                public void setAlt(String alt) {
                    this.alt = alt;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public static class AvatarsBean {

                    @Override
                    public String toString() {
                        return "AvatarsBean{" +
                                "small='" + small + '\'' +
                                ", large='" + large + '\'' +
                                ", medium='" + medium + '\'' +
                                '}';
                    }

                    /**
                     * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp
                     * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp
                     * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1466186775.21.webp
                     */

                    private String small;
                    private String large;
                    private String medium;

                    public String getSmall() {
                        return small;
                    }

                    public void setSmall(String small) {
                        this.small = small;
                    }

                    public String getLarge() {
                        return large;
                    }

                    public void setLarge(String large) {
                        this.large = large;
                    }

                    public String getMedium() {
                        return medium;
                    }

                    public void setMedium(String medium) {
                        this.medium = medium;
                    }
                }
            }

            public static class DirectorsBean {
                @Override
                public String toString() {
                    return "DirectorsBean{" +
                            "avatars=" + avatars +
                            ", name_en='" + name_en + '\'' +
                            ", name='" + name + '\'' +
                            ", alt='" + alt + '\'' +
                            ", id='" + id + '\'' +
                            '}';
                }

                /**
                 * avatars : {"small":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","large":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp","medium":"https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp"}
                 * name_en : Jon Favreau
                 * name : 乔恩·费儒
                 * alt : https://movie.douban.com/celebrity/1027164/
                 * id : 1027164
                 */




                private AvatarsBeanX avatars;
                private String name_en;
                private String name;
                private String alt;
                private String id;

                public AvatarsBeanX getAvatars() {
                    return avatars;
                }

                public void setAvatars(AvatarsBeanX avatars) {
                    this.avatars = avatars;
                }

                public String getName_en() {
                    return name_en;
                }

                public void setName_en(String name_en) {
                    this.name_en = name_en;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAlt() {
                    return alt;
                }

                public void setAlt(String alt) {
                    this.alt = alt;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public static class AvatarsBeanX {

                    @Override
                    public String toString() {
                        return "AvatarsBeanX{" +
                                "small='" + small + '\'' +
                                ", large='" + large + '\'' +
                                ", medium='" + medium + '\'' +
                                '}';
                    }

                    /**
                     * small : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp
                     * large : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp
                     * medium : https://img3.doubanio.com/view/celebrity/s_ratio_celebrity/public/p1405546733.56.webp
                     */

                    private String small;
                    private String large;
                    private String medium;

                    public String getSmall() {
                        return small;
                    }

                    public void setSmall(String small) {
                        this.small = small;
                    }

                    public String getLarge() {
                        return large;
                    }

                    public void setLarge(String large) {
                        this.large = large;
                    }

                    public String getMedium() {
                        return medium;
                    }

                    public void setMedium(String medium) {
                        this.medium = medium;
                    }
                }
            }
        }
    }
}
