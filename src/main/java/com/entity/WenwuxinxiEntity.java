package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 文物信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-17 16:26:15
 */
@TableName("wenwuxinxi")
public class WenwuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WenwuxinxiEntity() {
		
	}
	
	public WenwuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 文物编号
	 */
					
	private String wenwubianhao;
	
	/**
	 * 文物名称
	 */
					
	private String wenwumingcheng;
	
	/**
	 * 文物分类
	 */
					
	private String wenwufenlei;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 文物介绍
	 */
					
	private String wenwujieshao;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：文物编号
	 */
	public void setWenwubianhao(String wenwubianhao) {
		this.wenwubianhao = wenwubianhao;
	}
	/**
	 * 获取：文物编号
	 */
	public String getWenwubianhao() {
		return wenwubianhao;
	}
	/**
	 * 设置：文物名称
	 */
	public void setWenwumingcheng(String wenwumingcheng) {
		this.wenwumingcheng = wenwumingcheng;
	}
	/**
	 * 获取：文物名称
	 */
	public String getWenwumingcheng() {
		return wenwumingcheng;
	}
	/**
	 * 设置：文物分类
	 */
	public void setWenwufenlei(String wenwufenlei) {
		this.wenwufenlei = wenwufenlei;
	}
	/**
	 * 获取：文物分类
	 */
	public String getWenwufenlei() {
		return wenwufenlei;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：文物介绍
	 */
	public void setWenwujieshao(String wenwujieshao) {
		this.wenwujieshao = wenwujieshao;
	}
	/**
	 * 获取：文物介绍
	 */
	public String getWenwujieshao() {
		return wenwujieshao;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
