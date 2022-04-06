public class IllegalDayException extends RuntimeException {

    public IllegalDayException(int day){
        super("Указанный день " + day + " некорректен");
    }
}
