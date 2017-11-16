package com.example.mvpframe.mvpframe.bean;

import java.util.List;

/**
 * Created by libo on 2017/3/30.
 */

public class MainDataEntity {

    /**
     * data : {"categories":[{"id":5,"name":"新闻台"},{"id":14,"name":"音乐台"},{"id":1,"name":"交通台"},{"id":11,"name":"经济台"},{"id":2,"name":"体育台"},{"id":4,"name":"文艺台"},{"id":8,"name":"曲艺台"},{"id":12,"name":"综合台"},{"id":6,"name":"方言台"},{"id":3,"name":"外语台"},{"id":10,"name":"生活台"},{"id":13,"name":"都市台"},{"id":7,"name":"旅游台"},{"id":15,"name":"其他台"}],"localRadios":[{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_small.jpg","fmUid":23639177,"id":93,"name":"北京交通广播","playCount":3074186,"playUrl":{"aac24":"http://live.xmcdn.com/live/93/24.m3u8","aac64":"http://live.xmcdn.com/live/93/64.m3u8","ts24":"http://live.xmcdn.com/live/93/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/93/64.m3u8?transcode=ts"},"programId":44285,"programName":"音乐来了","programScheduleId":144265},{"coverLarge":"http://fdfs.xmcdn.com/group6/M03/AD/01/wKgDg1UKmFeRYjYsAAAeKv3qBXg018_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M03/AD/01/wKgDg1UKmFeRYjYsAAAeKv3qBXg018_mobile_small.jpg","fmUid":23639190,"id":105,"name":"北京长书广播","playCount":738936,"playUrl":{"aac24":"http://live.xmcdn.com/live/105/24.m3u8","aac64":"http://live.xmcdn.com/live/105/64.m3u8","ts24":"http://live.xmcdn.com/live/105/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/105/64.m3u8?transcode=ts"},"programId":44579,"programName":"小说连播","programScheduleId":76988},{"coverLarge":"http://fdfs.xmcdn.com/group6/M00/A9/16/wKgDhFUKmDeQ5wyYAAAeKv3qBXg090_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M00/A9/16/wKgDhFUKmDeQ5wyYAAAeKv3qBXg090_mobile_small.jpg","fmUid":23639187,"id":102,"name":"北京怀旧金曲","playCount":1426805,"playUrl":{"aac24":"http://live.xmcdn.com/live/102/24.m3u8","aac64":"http://live.xmcdn.com/live/102/64.m3u8","ts24":"http://live.xmcdn.com/live/102/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/102/64.m3u8?transcode=ts"},"programId":44513,"programName":"旧单车老情歌","programScheduleId":76608}],"location":"北京","topRadios":[{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/84/D2/wKgDhFT_oxGzpBYYAABn8GON2wI270_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/84/D2/wKgDhFT_oxGzpBYYAABn8GON2wI270_mobile_small.jpg","fmUid":19414524,"id":1065,"name":"中国之声","playCount":45053540,"playUrl":{"aac24":"http://live.xmcdn.com/live/1065/24.m3u8","aac64":"http://live.xmcdn.com/live/1065/64.m3u8","ts24":"http://live.xmcdn.com/live/1065/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1065/64.m3u8?transcode=ts"},"programId":94339,"programName":"央广新闻（午后版）","programScheduleId":5260},{"coverLarge":"http://fdfs.xmcdn.com/group6/M0A/AC/B3/wKgDg1UKhxSiBQSKAAD06SSV5o4807_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M0A/AC/B3/wKgDg1UKhxSiBQSKAAD06SSV5o4807_mobile_small.jpg","fmUid":23639121,"id":12,"name":"CNR音乐之声","playCount":17008112,"playUrl":{"aac24":"http://live.xmcdn.com/live/12/24.m3u8","aac64":"http://live.xmcdn.com/live/12/64.m3u8","ts24":"http://live.xmcdn.com/live/12/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/12/64.m3u8?transcode=ts"},"programId":45825,"programName":"快意音乐","programScheduleId":238},{"coverLarge":"http://fdfs.xmcdn.com/group6/M06/A8/EC/wKgDhFUKjfXyJ_wUAADGj2hAjb0684_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M06/A8/EC/wKgDhFUKjfXyJ_wUAADGj2hAjb0684_mobile_small.jpg","fmUid":23640064,"id":1066,"name":"CNR经济之声","playCount":14601367,"playUrl":{"aac24":"http://live.xmcdn.com/live/1066/24.m3u8","aac64":"http://live.xmcdn.com/live/1066/64.m3u8","ts24":"http://live.xmcdn.com/live/1066/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1066/64.m3u8?transcode=ts"},"programId":45807,"programName":"交易实况","programScheduleId":5386},{"coverLarge":"http://fdfs.xmcdn.com/group11/M04/33/9D/wKgDa1cLSGvyY7fBAACJEgwl40Q960_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group11/M04/33/9D/wKgDa1cLSGvyY7fBAACJEgwl40Q960_mobile_small.jpg","fmUid":23639643,"id":634,"name":"浙江交通之声","playCount":1090914,"playUrl":{"aac24":"http://live.xmcdn.com/live/634/24.m3u8","aac64":"http://live.xmcdn.com/live/634/64.m3u8","ts24":"http://live.xmcdn.com/live/634/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/634/64.m3u8?transcode=ts"},"programId":73975,"programName":"小崔热线","programScheduleId":200956},{"coverLarge":"http://fdfs.xmcdn.com/group6/M03/A8/DD/wKgDhFUKixLyR_tyAABxZ5RFmbM821_mobile_large.png","coverSmall":"http://fdfs.xmcdn.com/group6/M03/A8/DD/wKgDhFUKixLyR_tyAABxZ5RFmbM821_mobile_small.png","fmUid":23640046,"id":1040,"name":"CRI环球资讯","playCount":4472237,"playUrl":{"aac24":"http://live.xmcdn.com/live/1040/24.m3u8","aac64":"http://live.xmcdn.com/live/1040/64.m3u8","ts24":"http://live.xmcdn.com/live/1040/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1040/64.m3u8?transcode=ts"},"programId":96837,"programName":"新财富时间","programScheduleId":3763},{"coverLarge":"http://fdfs.xmcdn.com/group6/M04/88/A1/wKgDg1T_ocaCHE1EAABvxvPDeGc840_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M04/88/A1/wKgDg1T_ocaCHE1EAABvxvPDeGc840_mobile_small.jpg","fmUid":23639550,"id":536,"name":"江苏交通广播","playCount":2098119,"playUrl":{"aac24":"http://live.xmcdn.com/live/536/24.m3u8","aac64":"http://live.xmcdn.com/live/536/64.m3u8","ts24":"http://live.xmcdn.com/live/536/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/536/64.m3u8?transcode=ts"},"programId":68245,"programName":"交广双声道","programScheduleId":230237},{"coverLarge":"http://fdfs.xmcdn.com/group6/M0B/88/AE/wKgDg1T_on6A3yO5AAAQoeQQFfQ332_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M0B/88/AE/wKgDg1T_on6A3yO5AAAQoeQQFfQ332_mobile_small.jpg","fmUid":23639548,"id":534,"name":"江苏新闻广播","playCount":1975374,"playUrl":{"aac24":"http://live.xmcdn.com/live/534/24.m3u8","aac64":"http://live.xmcdn.com/live/534/64.m3u8","ts24":"http://live.xmcdn.com/live/534/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/534/64.m3u8?transcode=ts"},"programId":144696,"programName":"重点关注1542","programScheduleId":83620},{"coverLarge":"http://fdfs.xmcdn.com/group6/M02/A8/E4/wKgDhFUKjBXi6MLnAADDIiwjDe0507_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M02/A8/E4/wKgDhFUKjBXi6MLnAADDIiwjDe0507_mobile_small.jpg","fmUid":23640058,"id":1058,"name":"银河台相声小品","playCount":3457220,"playUrl":{"aac24":"http://live.xmcdn.com/live/1058/24.m3u8","aac64":"http://live.xmcdn.com/live/1058/64.m3u8","ts24":"http://live.xmcdn.com/live/1058/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1058/64.m3u8?transcode=ts"},"programId":66657,"programName":"时尚工厂","programScheduleId":4887},{"coverLarge":"http://fdfs.xmcdn.com/group11/M03/2B/93/wKgDbVbmH43iKuKXAAGddgp57ZI632_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group11/M03/2B/93/wKgDbVbmH43iKuKXAAGddgp57ZI632_mobile_small.jpg","fmUid":40956250,"id":1519,"name":"股市大直播","playCount":711571,"playUrl":{"aac24":"http://live.xmcdn.com/live/1613/24.m3u8","aac64":"http://live.xmcdn.com/live/1613/64.m3u8","ts24":"http://live.xmcdn.com/live/1613/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1613/64.m3u8?transcode=ts"},"programId":169682,"programName":"人人爱交易","programScheduleId":187754},{"coverLarge":"http://fdfs.xmcdn.com/group8/M04/F4/EE/wKgDYFarFUGhU4IfAAA_8PmYlK0916_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group8/M04/F4/EE/wKgDYFarFUGhU4IfAAA_8PmYlK0916_mobile_small.jpg","fmUid":0,"id":1739,"name":"FM87.5经典音乐调频","playCount":6367344,"playUrl":{"aac24":"http://live.xmcdn.com/live/1853/24.m3u8","aac64":"http://live.xmcdn.com/live/1853/64.m3u8","ts24":"http://live.xmcdn.com/live/1853/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1853/64.m3u8?transcode=ts"},"programId":170266,"programName":"经典875","programScheduleId":192287},{"coverLarge":"http://fdfs.xmcdn.com/group6/M00/63/00/wKgDg1U6A9zDHDplAAAPzJacyLM716_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M00/63/00/wKgDg1U6A9zDHDplAAAPzJacyLM716_mobile_small.jpg","fmUid":23639552,"id":538,"name":"江苏经典流行音乐","playCount":3481609,"playUrl":{"aac24":"http://live.xmcdn.com/live/538/24.m3u8","aac64":"http://live.xmcdn.com/live/538/64.m3u8","ts24":"http://live.xmcdn.com/live/538/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/538/64.m3u8?transcode=ts"},"programId":51991,"programName":"975音乐在旅途","programScheduleId":84153},{"coverLarge":"http://fdfs.xmcdn.com/group6/M06/84/CC/wKgDhFT_oqiCUBrBAACu6A-FdaE282_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M06/84/CC/wKgDhFT_oqiCUBrBAACu6A-FdaE282_mobile_small.jpg","fmUid":27950535,"id":53,"name":"上海动感101","playCount":6644671,"playUrl":{"aac24":"http://live.xmcdn.com/live/53/24.m3u8","aac64":"http://live.xmcdn.com/live/53/64.m3u8","ts24":"http://live.xmcdn.com/live/53/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/53/64.m3u8?transcode=ts"},"programId":44047,"programName":"午后原味音乐","programScheduleId":233484},{"coverLarge":"http://fdfs.xmcdn.com/group6/M06/84/C9/wKgDhFT_ooCjkmmkAAA4E0ludxE638_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M06/84/C9/wKgDhFT_ooCjkmmkAAA4E0ludxE638_mobile_small.jpg","fmUid":23639143,"id":56,"name":"上海第一财经频率","playCount":2139680,"playUrl":{"aac24":"http://live.xmcdn.com/live/56/24.m3u8","aac64":"http://live.xmcdn.com/live/56/64.m3u8","ts24":"http://live.xmcdn.com/live/56/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/56/64.m3u8?transcode=ts"},"programId":153815,"programName":"交易完成时","programScheduleId":66399},{"coverLarge":"http://fdfs.xmcdn.com/group6/M07/84/C2/wKgDhFT_oiHg_bMpAAARh9J2GYQ813_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M07/84/C2/wKgDhFT_oiHg_bMpAAARh9J2GYQ813_mobile_small.jpg","fmUid":23639163,"id":74,"name":"广东音乐之声","playCount":2820195,"playUrl":{"aac24":"http://live.xmcdn.com/live/74/24.m3u8","aac64":"http://live.xmcdn.com/live/74/64.m3u8","ts24":"http://live.xmcdn.com/live/74/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/74/64.m3u8?transcode=ts"},"programId":56063,"programName":"潘多拉音乐盒","programScheduleId":142292},{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/84/D3/wKgDhFT_oyah_RYGAAAKqbR0ZNU054_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/84/D3/wKgDhFT_oyah_RYGAAAKqbR0ZNU054_mobile_small.jpg","fmUid":16654790,"id":633,"name":"浙江之声","playCount":2269751,"playUrl":{"aac24":"http://live.xmcdn.com/live/633/24.m3u8","aac64":"http://live.xmcdn.com/live/633/64.m3u8","ts24":"http://live.xmcdn.com/live/633/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/633/64.m3u8?transcode=ts"},"programId":73845,"programName":"财经非常道","programScheduleId":217930},{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/84/D1/wKgDhFT_ovjB-3u8AAAv2V4xXBg126_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/84/D1/wKgDhFT_ovjB-3u8AAAv2V4xXBg126_mobile_small.jpg","fmUid":23639202,"id":119,"name":"天津相声广播","playCount":4198439,"playUrl":{"aac24":"http://live.xmcdn.com/live/119/24.m3u8","aac64":"http://live.xmcdn.com/live/119/64.m3u8","ts24":"http://live.xmcdn.com/live/119/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/119/64.m3u8?transcode=ts"},"programId":54591,"programName":"健康杂谈","programScheduleId":94115},{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_small.jpg","fmUid":23639177,"id":93,"name":"北京交通广播","playCount":3074186,"playUrl":{"aac24":"http://live.xmcdn.com/live/93/24.m3u8","aac64":"http://live.xmcdn.com/live/93/64.m3u8","ts24":"http://live.xmcdn.com/live/93/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/93/64.m3u8?transcode=ts"},"programId":44285,"programName":"音乐来了","programScheduleId":144265},{"coverLarge":"http://fdfs.xmcdn.com/group6/M07/BD/38/wKgDg1UP40HiF9NjAAAdZPhY7zg292_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M07/BD/38/wKgDg1UP40HiF9NjAAAdZPhY7zg292_mobile_small.jpg","fmUid":23640024,"id":1014,"name":"股票老左","playCount":888927,"playUrl":{"aac24":"http://live.xmcdn.com/live/1014/24.m3u8","aac64":"http://live.xmcdn.com/live/1014/64.m3u8","ts24":"http://live.xmcdn.com/live/1014/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1014/64.m3u8?transcode=ts"},"programId":134143,"programName":"数据一对一","programScheduleId":2977},{"coverLarge":"http://fdfs.xmcdn.com/group6/M03/AD/01/wKgDg1UKmFeRYjYsAAAeKv3qBXg018_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M03/AD/01/wKgDg1UKmFeRYjYsAAAeKv3qBXg018_mobile_small.jpg","fmUid":23639190,"id":105,"name":"北京长书广播","playCount":738936,"playUrl":{"aac24":"http://live.xmcdn.com/live/105/24.m3u8","aac64":"http://live.xmcdn.com/live/105/64.m3u8","ts24":"http://live.xmcdn.com/live/105/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/105/64.m3u8?transcode=ts"},"programId":44579,"programName":"小说连播","programScheduleId":76988},{"coverLarge":"http://fdfs.xmcdn.com/group6/M06/88/B9/wKgDg1T_oyTSlqpwAABANkDZJm0347_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M06/88/B9/wKgDg1T_oyTSlqpwAABANkDZJm0347_mobile_small.jpg","fmUid":23172486,"id":461,"name":"河南新闻广播","playCount":849379,"playUrl":{"aac24":"http://live.xmcdn.com/live/461/24.m3u8","aac64":"http://live.xmcdn.com/live/461/64.m3u8","ts24":"http://live.xmcdn.com/live/461/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/461/64.m3u8?transcode=ts"},"programId":138823,"programName":"非你莫属","programScheduleId":68384}]}
     * ret : 0
     */

    private DataBean data;
    private int ret;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getRet() {
        return ret;
    }

    public void setRet(int ret) {
        this.ret = ret;
    }

    public static class DataBean {
        /**
         * categories : [{"id":5,"name":"新闻台"},{"id":14,"name":"音乐台"},{"id":1,"name":"交通台"},{"id":11,"name":"经济台"},{"id":2,"name":"体育台"},{"id":4,"name":"文艺台"},{"id":8,"name":"曲艺台"},{"id":12,"name":"综合台"},{"id":6,"name":"方言台"},{"id":3,"name":"外语台"},{"id":10,"name":"生活台"},{"id":13,"name":"都市台"},{"id":7,"name":"旅游台"},{"id":15,"name":"其他台"}]
         * localRadios : [{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_small.jpg","fmUid":23639177,"id":93,"name":"北京交通广播","playCount":3074186,"playUrl":{"aac24":"http://live.xmcdn.com/live/93/24.m3u8","aac64":"http://live.xmcdn.com/live/93/64.m3u8","ts24":"http://live.xmcdn.com/live/93/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/93/64.m3u8?transcode=ts"},"programId":44285,"programName":"音乐来了","programScheduleId":144265},{"coverLarge":"http://fdfs.xmcdn.com/group6/M03/AD/01/wKgDg1UKmFeRYjYsAAAeKv3qBXg018_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M03/AD/01/wKgDg1UKmFeRYjYsAAAeKv3qBXg018_mobile_small.jpg","fmUid":23639190,"id":105,"name":"北京长书广播","playCount":738936,"playUrl":{"aac24":"http://live.xmcdn.com/live/105/24.m3u8","aac64":"http://live.xmcdn.com/live/105/64.m3u8","ts24":"http://live.xmcdn.com/live/105/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/105/64.m3u8?transcode=ts"},"programId":44579,"programName":"小说连播","programScheduleId":76988},{"coverLarge":"http://fdfs.xmcdn.com/group6/M00/A9/16/wKgDhFUKmDeQ5wyYAAAeKv3qBXg090_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M00/A9/16/wKgDhFUKmDeQ5wyYAAAeKv3qBXg090_mobile_small.jpg","fmUid":23639187,"id":102,"name":"北京怀旧金曲","playCount":1426805,"playUrl":{"aac24":"http://live.xmcdn.com/live/102/24.m3u8","aac64":"http://live.xmcdn.com/live/102/64.m3u8","ts24":"http://live.xmcdn.com/live/102/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/102/64.m3u8?transcode=ts"},"programId":44513,"programName":"旧单车老情歌","programScheduleId":76608}]
         * location : 北京
         * topRadios : [{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/84/D2/wKgDhFT_oxGzpBYYAABn8GON2wI270_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/84/D2/wKgDhFT_oxGzpBYYAABn8GON2wI270_mobile_small.jpg","fmUid":19414524,"id":1065,"name":"中国之声","playCount":45053540,"playUrl":{"aac24":"http://live.xmcdn.com/live/1065/24.m3u8","aac64":"http://live.xmcdn.com/live/1065/64.m3u8","ts24":"http://live.xmcdn.com/live/1065/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1065/64.m3u8?transcode=ts"},"programId":94339,"programName":"央广新闻（午后版）","programScheduleId":5260},{"coverLarge":"http://fdfs.xmcdn.com/group6/M0A/AC/B3/wKgDg1UKhxSiBQSKAAD06SSV5o4807_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M0A/AC/B3/wKgDg1UKhxSiBQSKAAD06SSV5o4807_mobile_small.jpg","fmUid":23639121,"id":12,"name":"CNR音乐之声","playCount":17008112,"playUrl":{"aac24":"http://live.xmcdn.com/live/12/24.m3u8","aac64":"http://live.xmcdn.com/live/12/64.m3u8","ts24":"http://live.xmcdn.com/live/12/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/12/64.m3u8?transcode=ts"},"programId":45825,"programName":"快意音乐","programScheduleId":238},{"coverLarge":"http://fdfs.xmcdn.com/group6/M06/A8/EC/wKgDhFUKjfXyJ_wUAADGj2hAjb0684_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M06/A8/EC/wKgDhFUKjfXyJ_wUAADGj2hAjb0684_mobile_small.jpg","fmUid":23640064,"id":1066,"name":"CNR经济之声","playCount":14601367,"playUrl":{"aac24":"http://live.xmcdn.com/live/1066/24.m3u8","aac64":"http://live.xmcdn.com/live/1066/64.m3u8","ts24":"http://live.xmcdn.com/live/1066/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1066/64.m3u8?transcode=ts"},"programId":45807,"programName":"交易实况","programScheduleId":5386},{"coverLarge":"http://fdfs.xmcdn.com/group11/M04/33/9D/wKgDa1cLSGvyY7fBAACJEgwl40Q960_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group11/M04/33/9D/wKgDa1cLSGvyY7fBAACJEgwl40Q960_mobile_small.jpg","fmUid":23639643,"id":634,"name":"浙江交通之声","playCount":1090914,"playUrl":{"aac24":"http://live.xmcdn.com/live/634/24.m3u8","aac64":"http://live.xmcdn.com/live/634/64.m3u8","ts24":"http://live.xmcdn.com/live/634/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/634/64.m3u8?transcode=ts"},"programId":73975,"programName":"小崔热线","programScheduleId":200956},{"coverLarge":"http://fdfs.xmcdn.com/group6/M03/A8/DD/wKgDhFUKixLyR_tyAABxZ5RFmbM821_mobile_large.png","coverSmall":"http://fdfs.xmcdn.com/group6/M03/A8/DD/wKgDhFUKixLyR_tyAABxZ5RFmbM821_mobile_small.png","fmUid":23640046,"id":1040,"name":"CRI环球资讯","playCount":4472237,"playUrl":{"aac24":"http://live.xmcdn.com/live/1040/24.m3u8","aac64":"http://live.xmcdn.com/live/1040/64.m3u8","ts24":"http://live.xmcdn.com/live/1040/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1040/64.m3u8?transcode=ts"},"programId":96837,"programName":"新财富时间","programScheduleId":3763},{"coverLarge":"http://fdfs.xmcdn.com/group6/M04/88/A1/wKgDg1T_ocaCHE1EAABvxvPDeGc840_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M04/88/A1/wKgDg1T_ocaCHE1EAABvxvPDeGc840_mobile_small.jpg","fmUid":23639550,"id":536,"name":"江苏交通广播","playCount":2098119,"playUrl":{"aac24":"http://live.xmcdn.com/live/536/24.m3u8","aac64":"http://live.xmcdn.com/live/536/64.m3u8","ts24":"http://live.xmcdn.com/live/536/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/536/64.m3u8?transcode=ts"},"programId":68245,"programName":"交广双声道","programScheduleId":230237},{"coverLarge":"http://fdfs.xmcdn.com/group6/M0B/88/AE/wKgDg1T_on6A3yO5AAAQoeQQFfQ332_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M0B/88/AE/wKgDg1T_on6A3yO5AAAQoeQQFfQ332_mobile_small.jpg","fmUid":23639548,"id":534,"name":"江苏新闻广播","playCount":1975374,"playUrl":{"aac24":"http://live.xmcdn.com/live/534/24.m3u8","aac64":"http://live.xmcdn.com/live/534/64.m3u8","ts24":"http://live.xmcdn.com/live/534/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/534/64.m3u8?transcode=ts"},"programId":144696,"programName":"重点关注1542","programScheduleId":83620},{"coverLarge":"http://fdfs.xmcdn.com/group6/M02/A8/E4/wKgDhFUKjBXi6MLnAADDIiwjDe0507_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M02/A8/E4/wKgDhFUKjBXi6MLnAADDIiwjDe0507_mobile_small.jpg","fmUid":23640058,"id":1058,"name":"银河台相声小品","playCount":3457220,"playUrl":{"aac24":"http://live.xmcdn.com/live/1058/24.m3u8","aac64":"http://live.xmcdn.com/live/1058/64.m3u8","ts24":"http://live.xmcdn.com/live/1058/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1058/64.m3u8?transcode=ts"},"programId":66657,"programName":"时尚工厂","programScheduleId":4887},{"coverLarge":"http://fdfs.xmcdn.com/group11/M03/2B/93/wKgDbVbmH43iKuKXAAGddgp57ZI632_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group11/M03/2B/93/wKgDbVbmH43iKuKXAAGddgp57ZI632_mobile_small.jpg","fmUid":40956250,"id":1519,"name":"股市大直播","playCount":711571,"playUrl":{"aac24":"http://live.xmcdn.com/live/1613/24.m3u8","aac64":"http://live.xmcdn.com/live/1613/64.m3u8","ts24":"http://live.xmcdn.com/live/1613/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1613/64.m3u8?transcode=ts"},"programId":169682,"programName":"人人爱交易","programScheduleId":187754},{"coverLarge":"http://fdfs.xmcdn.com/group8/M04/F4/EE/wKgDYFarFUGhU4IfAAA_8PmYlK0916_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group8/M04/F4/EE/wKgDYFarFUGhU4IfAAA_8PmYlK0916_mobile_small.jpg","fmUid":0,"id":1739,"name":"FM87.5经典音乐调频","playCount":6367344,"playUrl":{"aac24":"http://live.xmcdn.com/live/1853/24.m3u8","aac64":"http://live.xmcdn.com/live/1853/64.m3u8","ts24":"http://live.xmcdn.com/live/1853/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1853/64.m3u8?transcode=ts"},"programId":170266,"programName":"经典875","programScheduleId":192287},{"coverLarge":"http://fdfs.xmcdn.com/group6/M00/63/00/wKgDg1U6A9zDHDplAAAPzJacyLM716_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M00/63/00/wKgDg1U6A9zDHDplAAAPzJacyLM716_mobile_small.jpg","fmUid":23639552,"id":538,"name":"江苏经典流行音乐","playCount":3481609,"playUrl":{"aac24":"http://live.xmcdn.com/live/538/24.m3u8","aac64":"http://live.xmcdn.com/live/538/64.m3u8","ts24":"http://live.xmcdn.com/live/538/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/538/64.m3u8?transcode=ts"},"programId":51991,"programName":"975音乐在旅途","programScheduleId":84153},{"coverLarge":"http://fdfs.xmcdn.com/group6/M06/84/CC/wKgDhFT_oqiCUBrBAACu6A-FdaE282_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M06/84/CC/wKgDhFT_oqiCUBrBAACu6A-FdaE282_mobile_small.jpg","fmUid":27950535,"id":53,"name":"上海动感101","playCount":6644671,"playUrl":{"aac24":"http://live.xmcdn.com/live/53/24.m3u8","aac64":"http://live.xmcdn.com/live/53/64.m3u8","ts24":"http://live.xmcdn.com/live/53/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/53/64.m3u8?transcode=ts"},"programId":44047,"programName":"午后原味音乐","programScheduleId":233484},{"coverLarge":"http://fdfs.xmcdn.com/group6/M06/84/C9/wKgDhFT_ooCjkmmkAAA4E0ludxE638_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M06/84/C9/wKgDhFT_ooCjkmmkAAA4E0ludxE638_mobile_small.jpg","fmUid":23639143,"id":56,"name":"上海第一财经频率","playCount":2139680,"playUrl":{"aac24":"http://live.xmcdn.com/live/56/24.m3u8","aac64":"http://live.xmcdn.com/live/56/64.m3u8","ts24":"http://live.xmcdn.com/live/56/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/56/64.m3u8?transcode=ts"},"programId":153815,"programName":"交易完成时","programScheduleId":66399},{"coverLarge":"http://fdfs.xmcdn.com/group6/M07/84/C2/wKgDhFT_oiHg_bMpAAARh9J2GYQ813_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M07/84/C2/wKgDhFT_oiHg_bMpAAARh9J2GYQ813_mobile_small.jpg","fmUid":23639163,"id":74,"name":"广东音乐之声","playCount":2820195,"playUrl":{"aac24":"http://live.xmcdn.com/live/74/24.m3u8","aac64":"http://live.xmcdn.com/live/74/64.m3u8","ts24":"http://live.xmcdn.com/live/74/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/74/64.m3u8?transcode=ts"},"programId":56063,"programName":"潘多拉音乐盒","programScheduleId":142292},{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/84/D3/wKgDhFT_oyah_RYGAAAKqbR0ZNU054_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/84/D3/wKgDhFT_oyah_RYGAAAKqbR0ZNU054_mobile_small.jpg","fmUid":16654790,"id":633,"name":"浙江之声","playCount":2269751,"playUrl":{"aac24":"http://live.xmcdn.com/live/633/24.m3u8","aac64":"http://live.xmcdn.com/live/633/64.m3u8","ts24":"http://live.xmcdn.com/live/633/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/633/64.m3u8?transcode=ts"},"programId":73845,"programName":"财经非常道","programScheduleId":217930},{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/84/D1/wKgDhFT_ovjB-3u8AAAv2V4xXBg126_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/84/D1/wKgDhFT_ovjB-3u8AAAv2V4xXBg126_mobile_small.jpg","fmUid":23639202,"id":119,"name":"天津相声广播","playCount":4198439,"playUrl":{"aac24":"http://live.xmcdn.com/live/119/24.m3u8","aac64":"http://live.xmcdn.com/live/119/64.m3u8","ts24":"http://live.xmcdn.com/live/119/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/119/64.m3u8?transcode=ts"},"programId":54591,"programName":"健康杂谈","programScheduleId":94115},{"coverLarge":"http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_small.jpg","fmUid":23639177,"id":93,"name":"北京交通广播","playCount":3074186,"playUrl":{"aac24":"http://live.xmcdn.com/live/93/24.m3u8","aac64":"http://live.xmcdn.com/live/93/64.m3u8","ts24":"http://live.xmcdn.com/live/93/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/93/64.m3u8?transcode=ts"},"programId":44285,"programName":"音乐来了","programScheduleId":144265},{"coverLarge":"http://fdfs.xmcdn.com/group6/M07/BD/38/wKgDg1UP40HiF9NjAAAdZPhY7zg292_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M07/BD/38/wKgDg1UP40HiF9NjAAAdZPhY7zg292_mobile_small.jpg","fmUid":23640024,"id":1014,"name":"股票老左","playCount":888927,"playUrl":{"aac24":"http://live.xmcdn.com/live/1014/24.m3u8","aac64":"http://live.xmcdn.com/live/1014/64.m3u8","ts24":"http://live.xmcdn.com/live/1014/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1014/64.m3u8?transcode=ts"},"programId":134143,"programName":"数据一对一","programScheduleId":2977},{"coverLarge":"http://fdfs.xmcdn.com/group6/M03/AD/01/wKgDg1UKmFeRYjYsAAAeKv3qBXg018_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M03/AD/01/wKgDg1UKmFeRYjYsAAAeKv3qBXg018_mobile_small.jpg","fmUid":23639190,"id":105,"name":"北京长书广播","playCount":738936,"playUrl":{"aac24":"http://live.xmcdn.com/live/105/24.m3u8","aac64":"http://live.xmcdn.com/live/105/64.m3u8","ts24":"http://live.xmcdn.com/live/105/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/105/64.m3u8?transcode=ts"},"programId":44579,"programName":"小说连播","programScheduleId":76988},{"coverLarge":"http://fdfs.xmcdn.com/group6/M06/88/B9/wKgDg1T_oyTSlqpwAABANkDZJm0347_mobile_large.jpg","coverSmall":"http://fdfs.xmcdn.com/group6/M06/88/B9/wKgDg1T_oyTSlqpwAABANkDZJm0347_mobile_small.jpg","fmUid":23172486,"id":461,"name":"河南新闻广播","playCount":849379,"playUrl":{"aac24":"http://live.xmcdn.com/live/461/24.m3u8","aac64":"http://live.xmcdn.com/live/461/64.m3u8","ts24":"http://live.xmcdn.com/live/461/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/461/64.m3u8?transcode=ts"},"programId":138823,"programName":"非你莫属","programScheduleId":68384}]
         */

        private String location;
        private List<CategoriesBean> categories;
        private List<LocalRadiosBean> localRadios;
        private List<TopRadiosBean> topRadios;

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public List<CategoriesBean> getCategories() {
            return categories;
        }

        public void setCategories(List<CategoriesBean> categories) {
            this.categories = categories;
        }

        public List<LocalRadiosBean> getLocalRadios() {
            return localRadios;
        }

        public void setLocalRadios(List<LocalRadiosBean> localRadios) {
            this.localRadios = localRadios;
        }

        public List<TopRadiosBean> getTopRadios() {
            return topRadios;
        }

        public void setTopRadios(List<TopRadiosBean> topRadios) {
            this.topRadios = topRadios;
        }

        public static class CategoriesBean {
            /**
             * id : 5
             * name : 新闻台
             */

            private int id;
            private String name;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class LocalRadiosBean {
            /**
             * coverLarge : http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_large.jpg
             * coverSmall : http://fdfs.xmcdn.com/group6/M08/A9/12/wKgDhFUKl1DA8tvqAABaJo-b_eQ062_mobile_small.jpg
             * fmUid : 23639177
             * id : 93
             * name : 北京交通广播
             * playCount : 3074186
             * playUrl : {"aac24":"http://live.xmcdn.com/live/93/24.m3u8","aac64":"http://live.xmcdn.com/live/93/64.m3u8","ts24":"http://live.xmcdn.com/live/93/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/93/64.m3u8?transcode=ts"}
             * programId : 44285
             * programName : 音乐来了
             * programScheduleId : 144265
             */

            private String coverLarge;
            private String coverSmall;
            private int fmUid;
            private int id;
            private String name;
            private int playCount;
            private PlayUrlBean playUrl;
            private int programId;
            private String programName;
            private int programScheduleId;

            public String getCoverLarge() {
                return coverLarge;
            }

            public void setCoverLarge(String coverLarge) {
                this.coverLarge = coverLarge;
            }

            public String getCoverSmall() {
                return coverSmall;
            }

            public void setCoverSmall(String coverSmall) {
                this.coverSmall = coverSmall;
            }

            public int getFmUid() {
                return fmUid;
            }

            public void setFmUid(int fmUid) {
                this.fmUid = fmUid;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPlayCount() {
                return playCount;
            }

            public void setPlayCount(int playCount) {
                this.playCount = playCount;
            }

            public PlayUrlBean getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(PlayUrlBean playUrl) {
                this.playUrl = playUrl;
            }

            public int getProgramId() {
                return programId;
            }

            public void setProgramId(int programId) {
                this.programId = programId;
            }

            public String getProgramName() {
                return programName;
            }

            public void setProgramName(String programName) {
                this.programName = programName;
            }

            public int getProgramScheduleId() {
                return programScheduleId;
            }

            public void setProgramScheduleId(int programScheduleId) {
                this.programScheduleId = programScheduleId;
            }

            public static class PlayUrlBean {
                /**
                 * aac24 : http://live.xmcdn.com/live/93/24.m3u8
                 * aac64 : http://live.xmcdn.com/live/93/64.m3u8
                 * ts24 : http://live.xmcdn.com/live/93/24.m3u8?transcode=ts
                 * ts64 : http://live.xmcdn.com/live/93/64.m3u8?transcode=ts
                 */

                private String aac24;
                private String aac64;
                private String ts24;
                private String ts64;

                public String getAac24() {
                    return aac24;
                }

                public void setAac24(String aac24) {
                    this.aac24 = aac24;
                }

                public String getAac64() {
                    return aac64;
                }

                public void setAac64(String aac64) {
                    this.aac64 = aac64;
                }

                public String getTs24() {
                    return ts24;
                }

                public void setTs24(String ts24) {
                    this.ts24 = ts24;
                }

                public String getTs64() {
                    return ts64;
                }

                public void setTs64(String ts64) {
                    this.ts64 = ts64;
                }
            }
        }

        public static class TopRadiosBean {
            /**
             * coverLarge : http://fdfs.xmcdn.com/group6/M08/84/D2/wKgDhFT_oxGzpBYYAABn8GON2wI270_mobile_large.jpg
             * coverSmall : http://fdfs.xmcdn.com/group6/M08/84/D2/wKgDhFT_oxGzpBYYAABn8GON2wI270_mobile_small.jpg
             * fmUid : 19414524
             * id : 1065
             * name : 中国之声
             * playCount : 45053540
             * playUrl : {"aac24":"http://live.xmcdn.com/live/1065/24.m3u8","aac64":"http://live.xmcdn.com/live/1065/64.m3u8","ts24":"http://live.xmcdn.com/live/1065/24.m3u8?transcode=ts","ts64":"http://live.xmcdn.com/live/1065/64.m3u8?transcode=ts"}
             * programId : 94339
             * programName : 央广新闻（午后版）
             * programScheduleId : 5260
             */

            private String coverLarge;
            private String coverSmall;
            private int fmUid;
            private int id;
            private String name;
            private int playCount;
            private PlayUrlBeanX playUrl;
            private int programId;
            private String programName;
            private int programScheduleId;

            public String getCoverLarge() {
                return coverLarge;
            }

            public void setCoverLarge(String coverLarge) {
                this.coverLarge = coverLarge;
            }

            public String getCoverSmall() {
                return coverSmall;
            }

            public void setCoverSmall(String coverSmall) {
                this.coverSmall = coverSmall;
            }

            public int getFmUid() {
                return fmUid;
            }

            public void setFmUid(int fmUid) {
                this.fmUid = fmUid;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getPlayCount() {
                return playCount;
            }

            public void setPlayCount(int playCount) {
                this.playCount = playCount;
            }

            public PlayUrlBeanX getPlayUrl() {
                return playUrl;
            }

            public void setPlayUrl(PlayUrlBeanX playUrl) {
                this.playUrl = playUrl;
            }

            public int getProgramId() {
                return programId;
            }

            public void setProgramId(int programId) {
                this.programId = programId;
            }

            public String getProgramName() {
                return programName;
            }

            public void setProgramName(String programName) {
                this.programName = programName;
            }

            public int getProgramScheduleId() {
                return programScheduleId;
            }

            public void setProgramScheduleId(int programScheduleId) {
                this.programScheduleId = programScheduleId;
            }

            public static class PlayUrlBeanX {
                /**
                 * aac24 : http://live.xmcdn.com/live/1065/24.m3u8
                 * aac64 : http://live.xmcdn.com/live/1065/64.m3u8
                 * ts24 : http://live.xmcdn.com/live/1065/24.m3u8?transcode=ts
                 * ts64 : http://live.xmcdn.com/live/1065/64.m3u8?transcode=ts
                 */

                private String aac24;
                private String aac64;
                private String ts24;
                private String ts64;

                public String getAac24() {
                    return aac24;
                }

                public void setAac24(String aac24) {
                    this.aac24 = aac24;
                }

                public String getAac64() {
                    return aac64;
                }

                public void setAac64(String aac64) {
                    this.aac64 = aac64;
                }

                public String getTs24() {
                    return ts24;
                }

                public void setTs24(String ts24) {
                    this.ts24 = ts24;
                }

                public String getTs64() {
                    return ts64;
                }

                public void setTs64(String ts64) {
                    this.ts64 = ts64;
                }
            }
        }
    }
}
