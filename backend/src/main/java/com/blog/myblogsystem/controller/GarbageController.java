package com.blog.myblogsystem.controller;
import com.blog.myblogsystem.dao.GarbageDao;
import com.blog.myblogsystem.entity.Garbage;
import com.blog.myblogsystem.entity.Response;
import com.blog.myblogsystem.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
public class GarbageController {


    @Autowired
    private GarbageDao garbageDao;
    @Autowired
    private SessionService sessionService;
//    @Autowired
//    private UserInfoDao userInfoDao;
    //按照垃圾品类模糊查找用户
    @RequestMapping(value="garbage/findKind",method = RequestMethod.POST)
    public Response FindKind(@RequestBody Garbage garbage)
    {
//        if (sessionService.authority(session).getStatus()!="200")
//        {
//            return sessionService.authority(session);
//        }
        Response response=new Response();

        try{
            List<Garbage> garbageList;
            garbageList=garbageDao.getGarbage(garbage);
            if(garbageList.size()==0)
            {
                response.setStatus("404");
                response.setError("未找到此用品");
                return response;
            }
            else
            {
                response.setStatus("200");
                response.setError("查询到了产品！");
                response.setResult(garbageList);
                return  response;
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            response.setStatus("500");
            response.setError("服务器内部错误");
            return response;
        }
    }




}
