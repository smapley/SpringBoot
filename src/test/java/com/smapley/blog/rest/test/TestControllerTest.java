package com.smapley.blog.rest.test;

import com.alibaba.fastjson.JSON;
import com.smapley.blog.modules.test.Test;
import com.smapley.blog.modules.test.TestController;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by EricNts on 2018/4/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(TestController.class).build();
    }

    @org.junit.Test
    public void test() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/test")
                .contentType(MediaType.APPLICATION_JSON)
                .content(JSON.toJSONString(new Test("Eric", 24)))
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("name=Eric, age=24")));
    }
}