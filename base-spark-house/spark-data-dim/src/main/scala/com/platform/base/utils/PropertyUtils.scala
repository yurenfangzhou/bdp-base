package com.platform.base.utils

import java.util.Properties

import org.slf4j.{Logger, LoggerFactory}

/**
  * 配置文件工具
  *
  */
object PropertyUtils {

  @transient lazy private val logger: Logger = LoggerFactory.getLogger(PropertyUtils.getClass)

  private val pro = new Properties()

  /**
    * 初始化配置文件
    * @param propertyFileName 配置文件名称
    * @return 配置文件对象
    */
  def init(propertyFileName: String): Properties = {
    try {
      val inputStream = PropertyUtils.getClass.getClassLoader.getResourceAsStream(propertyFileName)
      pro.load(inputStream)
      pro
    } catch {
      case ex: Exception =>
        logger.error("加载配置异常==>{}",ex)
        throw new RuntimeException("加载配置异常", ex)
    }
  }

}