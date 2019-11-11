/**
 * @description 库存查询
 * @author HF
 * @create 2019/10/29
 * @since 1.0.0
 */
package com.t28.forest.stock.dao;


import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.t28.forest.core.vo.PageVO;
import com.t28.forest.stock.condition.MyCondition;
import com.t28.forest.stock.vo.InOutRecordsVO;
import com.t28.forest.stock.vo.StockInquiryVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StuotkInquiryDao {
   /**
    * 功能描述: 所有显示页面的查询
    * @param:
    * @return:// STOPSHIP:
    * @since: 1.0.0
    * @Author:
    * @Date:   2019/10/29
    */
    public List<StockInquiryVO> getAllStuotkInquiry(@Param("pageVO")PageVO pageVO,@Param("myCondition") MyCondition myCondition);

    /**
     * 功能描述: 查询总条数
     * @param:stockInquiryDTO
     * @return:integer
     * @since: 1.0.0
     * @Author:
     * @Date:
     */
    public Integer getAllCount(@Param("myCondition") MyCondition myCondition);
    /**
     * 功能描述:
     * @param: condition
     * @return: List
     * @since: 1.0.0
     * @Author: HF
     * @Date:
     */
    public  List<InOutRecordsVO> getAllInOutRecords(@Param("pageVO")PageVO pageVO);
    /**
     * 功能描述:
     * @param: condition
     * @return: Integer
     * @since: 1.0.0
     * @Author: HF
     * @Date:
     */
    public  Integer getCountInOutRecords(@Param("myCondition") MyCondition myCondition);
}
