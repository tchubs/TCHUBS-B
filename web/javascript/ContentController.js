/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


function ContentController() {

}

ContentController.prototype.sampleText = "Test";

ContentController.prototype.asyncFetchContent = function(){ 
         
         $.getJSON( '/articles', 
            function(data){
                contentController.displayContentCallback( data ); 
                } 
         );
}

ContentController.prototype.displayContentCallback = function( javascriptObject ){ 
    contentController.sampleText = javascriptObject[0].title + "<br/><br/>" + javascriptObject[0].text 
    
    $( ".previewDiv" ).html( "" );
    $( ".previewDiv" ).html( contentController.sampleText );
    contentController.resizeSearchPageDivs();        
}

ContentController.prototype.resizeSearchPageDivs = function(){ 
    var windowHeight = $(window).height();
    var windowWidth = $(window).width();
    
    var previewDivWidth = windowWidth / 4.5;
    var previewDivHeight = windowHeight / 3.4;
    
    $('.previewDiv').css("width", previewDivWidth);
    $('.previewDiv').css("max-width", previewDivWidth);
    $('.previewDiv').css("height", previewDivHeight);    
    $('.previewDiv').css("max-height", previewDivHeight);       
    
    var searchTableTDWidth = $('.search_table td').width();
    var searchTableTDHeight = $('.search_table td').height();
          
    if( previewDivWidth < searchTableTDWidth - 10 ){
        previewDivWidth = searchTableTDWidth;
    }
    
    if( previewDivHeight < searchTableTDHeight - 10 ){
        previewDivHeight = searchTableTDHeight;
    }    
    
    $('.previewDiv').css("width", previewDivWidth);
    $('.previewDiv').css("max-width", previewDivWidth);
    $('.previewDiv').css("height", previewDivHeight);    
    $('.previewDiv').css("max-height", previewDivHeight);    
    
    var previewPaneContentArea = ($('#sampleDiv').width() * $('#sampleDiv').height());
    //alert( "previewPaneContentArea area: " + previewPaneContentArea );
    
    var previewPaneTextLength = previewPaneContentArea / 170;
    //alert( "previewPaneTextLength area: " + previewPaneTextLength );
    
    $( ".previewDiv" ).html( contentController.sampleText.substr(0, previewPaneTextLength) );
}
