package com.zuojie.gmall.manage;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManageWebApplicationTests {
    @Test
    public void contectLoads() throws IOException, MyException {
        //获取配置文件的路径
        String tracker = GmallManageWebApplicationTests.class.getResource("/tracker.conf").getPath();

        ClientGlobal.init(tracker);

        TrackerClient trackerClient = new TrackerClient();

        //获得一个trakerServer的实例
        TrackerServer trackerServer = trackerClient.getConnection();
        //通过tracker获得一个Storage连接客户端
        StorageClient storageClient = new StorageClient(trackerServer,null);
        String[] uploadInfos = storageClient.upload_file("/Users/yangjie/Desktop/3.png", "png", null);
        for (String paths:uploadInfos
             ) {
            System.out.println(paths);
            
        }

    }

}
