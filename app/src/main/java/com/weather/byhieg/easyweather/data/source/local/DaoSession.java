package com.weather.byhieg.easyweather.data.source.local;

import com.weather.byhieg.easyweather.data.source.local.dao.CityEntityDao;
import com.weather.byhieg.easyweather.data.source.local.dao.LoveCityEntityDao;
import com.weather.byhieg.easyweather.data.source.local.dao.ProvinceEntityDao;
import com.weather.byhieg.easyweather.data.source.local.entity.CityEntity;
import com.weather.byhieg.easyweather.data.source.local.entity.LoveCityEntity;
import com.weather.byhieg.easyweather.data.source.local.entity.ProvinceEntity;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;


// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cityEntityDaoConfig;
    private final DaoConfig loveCityEntityDaoConfig;
    private final DaoConfig provinceEntityDaoConfig;

    private final CityEntityDao cityEntityDao;
    private final LoveCityEntityDao loveCityEntityDao;
    private final ProvinceEntityDao provinceEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cityEntityDaoConfig = daoConfigMap.get(CityEntityDao.class).clone();
        cityEntityDaoConfig.initIdentityScope(type);

        loveCityEntityDaoConfig = daoConfigMap.get(LoveCityEntityDao.class).clone();
        loveCityEntityDaoConfig.initIdentityScope(type);

        provinceEntityDaoConfig = daoConfigMap.get(ProvinceEntityDao.class).clone();
        provinceEntityDaoConfig.initIdentityScope(type);

        cityEntityDao = new CityEntityDao(cityEntityDaoConfig, this);
        loveCityEntityDao = new LoveCityEntityDao(loveCityEntityDaoConfig, this);
        provinceEntityDao = new ProvinceEntityDao(provinceEntityDaoConfig, this);

        registerDao(CityEntity.class, cityEntityDao);
        registerDao(LoveCityEntity.class, loveCityEntityDao);
        registerDao(ProvinceEntity.class, provinceEntityDao);
    }
    
    public void clear() {
        cityEntityDaoConfig.clearIdentityScope();
        loveCityEntityDaoConfig.clearIdentityScope();
        provinceEntityDaoConfig.clearIdentityScope();
    }

    public CityEntityDao getCityEntityDao() {
        return cityEntityDao;
    }

    public LoveCityEntityDao getLoveCityEntityDao() {
        return loveCityEntityDao;
    }

    public ProvinceEntityDao getProvinceEntityDao() {
        return provinceEntityDao;
    }

}
