package com.tang.controller;

import com.tang.entity.Jurisdictions;
import com.tang.entity.pojo.Mune;
import com.tang.mapper.JurisdictionsMapper;
import com.tang.service.impl.JurisdictionsServiceImpl;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author com.tang
 * @since 2022-11-25
 */
@RestController
@RequestMapping("/jurisdictions")
@CrossOrigin
public class JurisdictionsController {

    @Autowired
    JurisdictionsServiceImpl jurisdictionsService;

    @RequestMapping("/menu/list")
    public List<Mune> list(HttpServletRequest request){
        String username = (String) request.getSession().getAttribute("username");
        List<Mune> parentList=new ArrayList<>();
        List<Mune> childList=new ArrayList<>();
        List<Jurisdictions> list = jurisdictionsService.selectByUserName(username);

        //获取父节点
        for (Jurisdictions jurisdictions : list) {
            String name=jurisdictions.getRouteurl();
            Mune mune=new Mune();
            mune.setId(jurisdictions.getJuId());
            mune.setLabel(jurisdictions.getJuName());
            mune.setNodeurl(jurisdictions.getRouteurl());
            if (name.indexOf("/")==name.lastIndexOf("/")){
                parentList.add(mune);
            }else {
                childList.add(mune);
            }
        }


        //获取子节点
        for (Mune mune : parentList) {
            List<Mune> list1=new ArrayList<>();
            for (Mune mune1 : childList) {
                String name=mune1.getNodeurl();
                if (name.substring(name.indexOf("/")  , name.lastIndexOf("/")).equals(mune.getNodeurl())){
                   list1.add(mune1);
                }
            }
            mune.setChildren(list1);
        }

        return parentList;
    }


    @RequestMapping("/menu/listAll")
    public List<Mune> listAll(){

        List<Mune> parentList=new ArrayList<>();
        List<Mune> childList=new ArrayList<>();
        List<Jurisdictions> list = jurisdictionsService.list();

        //获取父节点
        for (Jurisdictions jurisdictions : list) {
            String name=jurisdictions.getRouteurl();
            Mune mune=new Mune();
            mune.setId(jurisdictions.getJuId());
            mune.setLabel(jurisdictions.getJuName());
            mune.setNodeurl(jurisdictions.getRouteurl());
            if (name.indexOf("/")==name.lastIndexOf("/")){
                parentList.add(mune);
            }else {
                childList.add(mune);
            }
        }


        //获取子节点
        for (Mune mune : parentList) {
            List<Mune> list1=new ArrayList<>();
            for (Mune mune1 : childList) {
                String name=mune1.getNodeurl();
                if (name.substring(name.indexOf("/")  , name.lastIndexOf("/")).equals(mune.getNodeurl())){
                    list1.add(mune1);
                }
            }
            mune.setChildren(list1);
        }

        return parentList;
    }
}
