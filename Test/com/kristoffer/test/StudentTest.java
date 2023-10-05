package com.kristoffer.test;

import com.kristoffer.demo.School;
import com.kristoffer.demo.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void myTest() {
        Student benny = null;
        assertNotNull(benny);
    }

    @Test
    public void addition() {
        assertEquals(4, 2+2);
    }



}