var index = {
    init: function(){
        index.topBanner();
    },
    topBanner:function(){
        var param ={
            webBannerId:''
            };

            $.ajax({
            url:'http://localhost:8095/mylife-ui-api/webContentController/queryWebBanner.do',
            cache:false,
            async:false,
            dataType:"json",
            data:{param:JSON.stringify(param)},
            success: function(data){
                var list = data.model.webBannerList;
                console.log(data);
                console.log(list);
                var html = template($('#tpl').html(), {
                    list:list
                },'index');
                $('#topBanner').html(html);
            }
        });


    },
    eventRecent:function () {
        var param ={
            newsId:''
        };

        $.ajax({
            url:'http://localhost:8095/mylife-ui-api/webContentController/queryRecentNews.do',
            cache:false,
            async:false,
            dataType:"json",
            data:{param:JSON.stringify(param)},
            success: function(data){
                var list = data.model.webBannerList;
                console.log(data);
                console.log(list);
                var html = template($('#tpl').html(), {
                    list:list
                },'index');
                $('#topBanner').html(html);
            }
        });
    },
};
$(function(){
  index.init();
});