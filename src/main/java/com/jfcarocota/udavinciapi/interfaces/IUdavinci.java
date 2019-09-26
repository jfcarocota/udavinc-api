package com.jfcarocota.udavinciapi.interfaces;

import com.jfcarocota.udavinciapi.modules.Udavinci;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public interface IUdavinci {

    @ResponseBody
    @CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
    @RequestMapping(path = "/history", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    Udavinci getHistory();
}
