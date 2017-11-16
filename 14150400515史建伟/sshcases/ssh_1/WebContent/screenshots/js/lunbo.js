function changeImg(){  
      
    var $imgs=$("#ad_img li");  
    var $nums=$("#ad_num li");  
    var isStop=false;  
    var index=0;  
      
    $nums.eq(index).addClass("numsover");  
    $nums.eq(index).siblings().removeClass("numsover");  
    $imgs.eq(index).show();  
      
    
    $nums.mouseover(function(){  
        isStop=true;  
         
        $(this).addClass("numsover").siblings().removeClass("numsover");  
          
          
        index=$nums.index(this);  
        $imgs.eq(index).show();  
        $imgs.eq(index).siblings().hide();  
    }).mouseout(function(){isStop=false});  
      
    setInterval(function(){  
        if(isStop) return;  
        if(index>=5) index=-1;  
        index++;  
          
        $nums.eq(index).addClass("numsover").siblings().removeClass("numsover");  
          
        $imgs.eq(index).show();  
        $imgs.eq(index).siblings().hide();  
          
        },2000);  
}
	
	$(document).ready(function(e) { 
     changeImg();  
});  
