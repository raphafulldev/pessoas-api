package br.com.attornatus.pessoasapi.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.web.context.WebApplicationContext;

import br.com.attornatus.pessoasapi.service.PessoaService;

@WebMvcTest(PessoaController.class)
@ContextConfiguration(classes = { PessoaController.class, TransactionManagementConfigurer.class })
public class PessoaControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @MockBean
    PessoaService service;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void findAll_OK() throws Exception {
        mockMvc.perform(get(String.format("/pessoas"))
                        .contentType("application/json"))
                .andExpect(status().isOk());
    }

    @Test
    public void findById_OK() throws Exception {
        mockMvc.perform(get(String.format("/pessoas/" + 1))
                        .contentType("application/json"))
                .andExpect(status().isOk());
    }
}
