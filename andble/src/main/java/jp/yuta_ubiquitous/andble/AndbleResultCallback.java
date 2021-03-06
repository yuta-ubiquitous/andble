package jp.yuta_ubiquitous.andble;

public abstract class AndbleResultCallback {

    public static final int CONNECT = 1;
    public static final int READ = 2;
    public static final int WRITE = 3;
    public static final int SET_NOTIFICATION = 4;

    public AndbleResultCallback(){};

    public void onSuccess( int operation ){};
    public void onSuccess( int operation, byte[] values){};
    public void onFailed( int operation ){};
}
