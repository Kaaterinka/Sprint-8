package com.example.retailer.consumer

import com.example.retailer.api.distributor.OrderInfo
import com.example.retailer.service.OrderService
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired

class RetailerConsumerImpl : RetailerConsumer {
    @Autowired
    private lateinit var orderService: OrderService

    @RabbitListener(queues = ["retailer"])
    override fun take(message: String) {
        val orderInfo = jacksonObjectMapper().readValue<OrderInfo>(message)
        orderService.updateOrderInfo(orderInfo)
    }
}