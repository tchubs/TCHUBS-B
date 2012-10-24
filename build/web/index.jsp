<%-- 
    Document   : index
    Created on : Aug 13, 2012, 1:47:18 PM
    Author     : tchubs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>tchubs.com</title>

        <!-- STYLESHEETS --> 
        <link rel="stylesheet" type="text/css" href="/css/containers.css" />
        <!-- STYLESHEETS -->   

        <!-- JQUERY JAVASCRIPT LIBRARIES HOSTED BY GOOGLE-->	
        <script language="JavaScript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js" type="text/javascript"></script>
        <script language="JavaScript" src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js" type="text/javascript"></script>
        <!-- JQUERY JAVASCRIPT LIBRARIES HOSTED BY GOOGLE-->     
        
        <!-- TCHUBS JAVASCRIPT LIBRARIES -->
        <script language="JavaScript" src="/javascript/ContentController.js"  type="text/javascript"></script>
        <!-- TCHUBS JAVASCRIPT LIBRARIES -->
        
        <script language="JavaScript">
            
            
            var contentController;
            
            $(document).ready( function(){
                contentController = new ContentController();
                contentController.asyncFetchContent();  
                
                $(window).resize( contentController.resizeSearchPageDivs );
            });
            
            
            
        </script>
        
    </head>

    <body>
        <div class="window">
            <table class="search_table" cellspacing="5px">

                <tr>
                    <td><div id="sampleDiv" class="previewDiv">Test</div></td><td><div class="previewDiv">Test</div></td><td><div class="previewDiv">Test</div></td><td><div class="previewDiv">Test</div></td>
                </tr>            

                <tr>
                    <td><div class="previewDiv">Test</div></td><td colspan="2"><div class="testID">Test</div></td><td><div class="previewDiv">Test</div></td>
                </tr>

                <tr>
                    <td><div class="previewDiv">Test</div></td><td><div class="previewDiv">Test</div></td><td><div class="previewDiv">Test</div></td><td><div class="previewDiv">Test</div></td>
                </tr>
                
            </table>
        </div>
    </body>

</html>
