package com.kristoffer.test;

import com.kristoffer.demo.School;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    public void schoolTest() {
        School sti = new School();

        sti.welcomeStudent();
        // assertEquals("Hello world!", sti.welcomeStudent());
        assertInstanceOf(String.class, sti.welcomeStudent());

    }

}