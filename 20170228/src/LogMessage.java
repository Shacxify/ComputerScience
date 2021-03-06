public class LogMessage
{

    private String machineId;
    private String description;

    //constructor to strip message into machineId and description
    public LogMessage(String message){
        int colonLocation = message.indexOf(":");
        machineId = message.substring(0, colonLocation);
        description = message.substring(colonLocation + 1, message.length());
    }

    public boolean containsWord(String keyword){
        int keywordIndex = description.indexOf(keyword); 

        boolean cA = false;
        boolean cB = false;
        boolean cC = false;
        
        if(description.indexOf(keyword) == -1){ 
            cA = true; 
        }

        if(description.indexOf(keyword) == 0 ||description.substring(keywordIndex - 1, keywordIndex) == "" ){
            cB = true; 
        }
        
        if(keywordIndex + keyword.length() == description.length()|| description.substring(keywordIndex+keyword.length(), keywordIndex+keyword.length()+1) == ""){
            cC = true; 
        }

        if(cA && cB && cC){
            return true; 
        }
        else{
            return false;
        }
    }
}


