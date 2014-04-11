package fhe.ai.pme.myweather.api;

public class WeatherData {
    public final static String APPID = "4257cd7268fd516fbd7cb6bee95e5024";
    public final static int CURRENTWEATHER = 1;
    public final static int CURRENTDAY = 2;
    public final static int THREEDAYS = 3;
    public final static int SEVENDAYS = 4;

    public static Location getWeatherData(int mode, Location loc) {
        return loc;
    }
}
