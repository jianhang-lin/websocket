package com.example.demo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

// import com.example.demo.bean.UserInfo;
// import com.example.demo.service.MyService;
import com.example.demo.websocket.MyWebSocket;
import com.google.gson.Gson;

@Controller
@RequestMapping(value = "/test")
public class MyController {

    //@Autowired
    //private MyService Service;

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test() {
        Gson gson = new Gson();
        try {
            MyWebSocket.sendInfo("大家好");//发送消息到clientsocket
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String,Object> map = new HashMap<>();
        map.put("result","Hello");
        return gson.toJson(map);
    }
}

