package com.t28.forest.operate.controller;

import com.t28.forest.core.cond.Condition;
import com.t28.forest.core.model.CommModel;
import com.t28.forest.core.model.JgGridListModel;
import com.t28.forest.core.vo.PageVO;
import com.t28.forest.operate.service.ShipmentService;
import com.t28.forest.operate.vo.ShipmentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author XiangYuFeng
 * @description 运单控制类
 * @create 2019/11/4
 * @since 1.0.0
 */
@Controller
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    ShipmentService shipmentService;

    @RequestMapping("/show")
    @ResponseBody
    public String getShipments(CommModel model) {
        List<ShipmentVO> shipments = shipmentService.getShipmentsByPage(new PageVO(1, 5), new Condition());
        JgGridListModel jgGridListModel = new JgGridListModel(shipments);
        return jgGridListModel.toJSONString();
    }

}