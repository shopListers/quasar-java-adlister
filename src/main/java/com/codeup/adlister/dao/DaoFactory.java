import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;
    private static Quotes quotesDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new ListAdsDao();
        }
        return adsDao;
    }

    public static Ads getAdsDao()  {
        try{
            if (quotesDao == null){
                quotesDao = new MySQLQuotesDAO();
            }}
        catch (SQLException e){
            e.printStackTrace();
        }
        return AdsDao;
    }
}