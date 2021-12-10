package com.codeup.adlister.dao;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(new Config());
        }
        return adsDao;
    }

	public static Users getUsersDao() {
		if (usersDao == null) {
			usersDao = new MySQLUsersDao(new Config());
		}
		return usersDao;
	}
}


