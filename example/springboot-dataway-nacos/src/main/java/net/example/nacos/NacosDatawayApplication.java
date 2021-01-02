/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.example.nacos;
import net.hasor.spring.boot.EnableHasor;
import net.hasor.spring.boot.EnableHasorWeb;
import net.hasor.spring.boot.WorkAt;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 赵永春 (zyc@hasor.net)
 * @version : 2021-01-02
 */
@EnableHasor()
@EnableHasorWeb(at = WorkAt.Interceptor)
@SpringBootApplication(scanBasePackages = { "net.example.nacos" })
public class NacosDatawayApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDatawayApplication.class, args);
    }
}