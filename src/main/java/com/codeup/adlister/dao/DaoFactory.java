package com.codeup.adlister.dao;

<<<<<<< HEAD
public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }
}

=======
import javax.servlet.jsp.jstl.core.Config;

public class DaoFactory {
	private static Ads adsDao;
	private static Users usersDao;
	private static Config config = new Config();

	public static Ads getAdsDao() {
		if (adsDao == null) {
			adsDao = new MySQLAdsDao(config);
		}
		return adsDao;
	}

	public static Users getUsersDao() {
		if (usersDao == null) {
			usersDao = new MySQLUsersDao(config);
		}
		return usersDao;
	}
}
>>>>>>> 3770696f641a980ddd7e32d96cd13ad6c72cbd6a
