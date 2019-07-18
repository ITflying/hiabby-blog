$(function(){
    $("#switchLabel").click(function(){
        if ($("#tagsDiv").is(":visible")) {
            $("#tagsDiv").hide();
            $("#timeLineDiv").show()
        }
        else{
            $("#tagsDiv").show();
            $("#timeLineDiv").hide();
        }
    });
})