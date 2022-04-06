public class IllegalStepsException extends RuntimeException {

    public IllegalStepsException(int steps){
        super("Указанное количество шагов " + steps + " некорректно");
    }
}
