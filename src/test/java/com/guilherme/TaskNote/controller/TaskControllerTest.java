package com.guilherme.TaskNote.controller;


import com.guilherme.TaskNote.TaskNoteApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


//@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = TaskNoteApplication.class)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TaskControllerTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();

    }

    @Test
    public void verifyAllTasks() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/task").accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(4))).andDo(print());
    }
}