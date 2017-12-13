var index = {
    init: function(){
        index.patch();
    },
    patch:function(){
        var param ={
            webBannerId:""
            },
            $.ajax({
            url:'http://localhost:8095/webContentController/queryWebBanner.do',
            cache:false,
            async:false,
            dataType:"json",
            data:{param:JSON.stringify(param)},
            success: function(data){
                var list = data.webBannerList;
                var html = template($('#tpl').html(), {
                    list:list,
                    ishowIcon:isShowIcon
                },'index');
                $('#suibianba').html(html);
            }
        });


    }
};
$(function(){
  index.init();
});