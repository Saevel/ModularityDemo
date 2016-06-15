module dao {

        requires model;

        exports prv.zielony.modularity.demo.dao.api;

        provides prv.zielony.modularity.demo.dao.api.UserDao with prv.zielony.modularity.demo.dao.DefaultUserDao;
}
