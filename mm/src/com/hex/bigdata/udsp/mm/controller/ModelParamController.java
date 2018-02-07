package com.hex.bigdata.udsp.mm.controller;

import com.hex.bigdata.udsp.common.util.JSONUtil;
import com.hex.bigdata.udsp.mm.model.ModelParam;
import com.hex.bigdata.udsp.mm.service.ModelParamService;
import com.hex.goframe.controller.BaseController;
import com.hex.goframe.model.MessageResult;
import com.hex.goframe.model.Page;
import com.hex.goframe.model.PageListResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Author: tomnic.wang
 * DATE:2017/4/19
 * TIME:14:47
 */
@RequestMapping("/mm/params/")
@Controller
public class ModelParamController extends BaseController {
    
    private static Logger logger = LogManager.getLogger(ModelParamController.class);

    @Autowired
    private ModelParamService modelParamService;

    @RequestMapping({"/page"})
    @ResponseBody
    public PageListResult page(ModelParam modelParam, Page page) {
        logger.debug("select search=" + JSONUtil.parseObj2JSON(modelParam) + " page=" + JSONUtil.parseObj2JSON(page));
        List<ModelParam> list = null;
        try {
            list = modelParamService.select(modelParam, page);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("系统异常：" + e);
        }
        return new PageListResult(list, page);
    }

    @RequestMapping({"/select"})
    @ResponseBody
    public PageListResult select(ModelParam modelParam) {
        logger.debug("select search=" + JSONUtil.parseObj2JSON(modelParam));
        List<ModelParam> list = null;
        try {
            list = modelParamService.select(modelParam);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("系统异常：" + e);
        }
        return new PageListResult(list);
    }

    @RequestMapping({"/select/{pkId}"})
    @ResponseBody
    public MessageResult selectByPkId(@PathVariable("pkId") String pkId) {
        logger.debug("select pkId=" + pkId);
        ModelParam modelParam = null;
        try {
            modelParam = modelParamService.select(pkId);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("系统异常：" + e);
        }
        return new MessageResult(true, "", modelParam);
    }

    @RequestMapping({"/select/{mmId}/{type}"})
    @ResponseBody
    public MessageResult selectByPkIdAndType(@PathVariable("mmId") String mmId, @PathVariable("type") String type) {
        logger.debug("select mmId=" + mmId + ",type=" + type);
        List<ModelParam> list = null;
        try {
            list = modelParamService.select(mmId, type);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("系统异常：" + e);
        }
        return new PageListResult(list);
    }
}
