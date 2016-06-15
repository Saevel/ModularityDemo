module service {

	requires java.base;	
        requires dao;
	requires model;

	uses prv.zielony.modularity.demo.dao.api.UserDao;

		provides prv.zielony.modularity.demo.service.api.UserService with prv.zielony.modularity.demo.service.DefaultUserService;

        exports prv.zielony.modularity.demo.service.api;
}
