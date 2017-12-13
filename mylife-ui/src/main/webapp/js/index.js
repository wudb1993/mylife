var index = {
    init: function(){
        index.patch();
    },
    patch:function(){
        var param ={
            webBannerId:3
            };

            $.ajax({
            url:'http://localhost:8080/mylife-ui-api/webContentController/queryWebBanner.do',
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
                $('#suibianba').html(html);
            }
        });


    }
};
$(function(){
  index.init();
});