package com.codeup.adlister.dao;


//import javax.servlet.jsp.jstl.core.Config;

import com.codeup.adlister.Config;




import com.codeup.adlister.Config;

public class DaoFactory {

	private static Ads adsDao;
	private static Users usersDao;
	private static Config config = new Config();


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




//public class DaoFactory {
//    private static Ads adsDao;
//    private static Users usersDao;
//
//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            adsDao = new MySQLAdsDao(new Config());
//        }
//        return adsDao;
//    }

//	public static Users getUsersDao() {
//		if (usersDao == null) {
//			usersDao = new MySQLUsersDao(new Config());
//		}
//		return usersDao;
//	}
//
//
//}
    //THIS IS WHAT YOU DID


//    public static Users getUsersDao() {
//        if (usersDao == null) {
//            usersDao = new MySQLUsersDao(config);
//        }
//        return usersDao;
//    }
//
//}

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




	public static Users getUsersDao() {
		if (usersDao == null) {
			usersDao = new MySQLUsersDao(config);
		}
		return usersDao;
	}



}

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao(config);
        }
        return usersDao;
    }



}
