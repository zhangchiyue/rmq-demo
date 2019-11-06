package cn.itcast.rocketmq;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;

/**
 * @author THY
 * @version 1.0
 * @className TopicDemo
 * @date 2019/11/6
 **/
public class TopicDemo {
    public static void main(String[] args) throws MQClientException {
        DefaultMQProducer producer = new DefaultMQProducer("HAOKE_IM");
        producer.setNamesrvAddr("49.233.166.91:9876");
        producer.start();

        producer.createTopic("broker_haoke_im","haoke_im_topic",8);
        System.out.println("创建topic成功");
        producer.shutdown();
    }
}
