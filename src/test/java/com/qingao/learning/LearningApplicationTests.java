package com.qingao.learning;

import com.qingao.learning.controller.IndexController;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LearningApplicationTests {

	private MockMvc mvc;
	@Before
	public void setup() throws Exception{
		mvc = MockMvcBuilders.standaloneSetup(new IndexController()).build();
	}
	@Test
	public void hello() throws Exception{
		mvc.perform(MockMvcRequestBuilders.get("/")
				.accept(MediaType.ALL))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("Hello Spring boot!!!!")));
	}

}
