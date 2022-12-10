// Singleton одиночка единственный экземпляр определенного класса который доступен для всех клиентов
public class Singleton {
    public static void main(String[] args){
    ProgramLogger.getProgramLogger().addLogInfo("First file info");
    ProgramLogger.getProgramLogger().addLogInfo("Second file info");
    ProgramLogger.getProgramLogger().addLogInfo("Third file info");

    ProgramLogger.getProgramLogger().showLofFile();
    }
}
class ProgramLogger{
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file\n\n";
    public static  synchronized ProgramLogger getProgramLogger(){
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    private ProgramLogger(){

    }
    public void addLogInfo(String loginfo){
        logFile += loginfo + "\n";
    }

    public void showLofFile(){
        System.out.println(logFile);
    }
}