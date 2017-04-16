/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.openmessaging;

/**
 * 用于创建Producer/Consumer等等对象的一个接口<p>
 * The {@code MessagingAccessPoint} obtained from {@link MessagingAccessPointManager} is capable of creating {@code
 * Producer}, {@code Consumer}, {@code ServiceEndPoint}, and so on.
 * <p> For example:
 * <pre>
 * MessagingAccessPoint messagingAccessPoint = MessagingAccessPointManager.getMessagingAccessPoint("openmessaging:rocketmq://localhost:10911/namespace");
 * Producer producer = messagingAccessPoint.createProducer();
 * producer.send(producer.createBytesMessageToTopic("HELLO_TOPIC", "HELLO_BODY".getBytes(Charset.forName("UTF-8"))));
 * </pre>
 *
 * @author vintagewang@apache.org
 * @author yukon@apache.org
 *
 * @version OMS 1.0
 * @since OMS 1.0
 */
public interface MessagingAccessPoint extends ServiceLifecycle {
    /**
     * Create a new {@code Producer} for the specified {@code MessagingAccessPoint}.
     *
     * @return the created producer
     */
    Producer createProducer();

    /**
     * Create a new {@code Producer} for the specified {@code MessagingAccessPoint} with some preset properties.
     *
     * @param properties the preset properties
     * @return the created producer
     */
    Producer createProducer(final KeyValue properties);

    /**
     * Create a new {@code PushConsumer} for the specified {@code MessagingAccessPoint}.
     *
     * @return the created consumer
     */
    PushConsumer createPushConsumer();

    /**
     * Create a new {@code PushConsumer} for the specified {@code MessagingAccessPoint} with some preset properties.
     *
     * @param properties the preset properties
     * @return the created consumer
     */
    PushConsumer createPushConsumer(final KeyValue properties);

    /**
     * Create a new {@code PullConsumerAck} for the specified {@code MessagingAccessPoint}.
     *
     * @return the created consumer
     */
    PullConsumerAck createPullConsumerAck();

    /**
     * Create a new {@code PullConsumerAck} for the specified {@code MessagingAccessPoint} with some preset properties.
     *
     * @param properties the preset properties
     * @return the created consumer
     */
    PullConsumerAck createPullConsumerAck(final KeyValue properties);

    /**
     * Create a new {@code PullConsumerCursor} for the specified {@code MessagingAccessPoint}.
     *
     * @return the created consumer
     */
    PullConsumerCursor createPullConsumerCursor();

    /**
     * Create a new {@code PullConsumerCursor} for the specified {@code MessagingAccessPoint} with some preset properties.
     *
     * @param properties the preset properties
     * @return the created consumer
     */
    PullConsumerCursor createPullConsumerCursor(final KeyValue properties);

    /**
     * Create a new {@code ResourceManager} for the specified {@code MessagingAccessPoint}.
     *
     * @return the created {@code ResourceManager}
     */
    ResourceManager createResourceManager();

    /**
     * Create a new {@code Filters} for the specified {@code MessagingAccessPoint}.
     *
     * @return the created {@code Filters}
     */
    Filters createFilters();

    /**
     * Create a new {@code ServiceEndPoint} for the specified {@code MessagingAccessPoint}.
     *
     * @return the created {@code ServiceEndPoint}
     */
    ServiceEndPoint createServiceEndPoint();

    /**
     * Create a new {@code ServiceEndPoint} for the specified {@code MessagingAccessPoint} with some preset properties.
     *
     * @param properties the preset properties
     * @return the created {@code ServiceEndPoint}
     */
    ServiceEndPoint createServiceEndPoint(final KeyValue properties);
}
