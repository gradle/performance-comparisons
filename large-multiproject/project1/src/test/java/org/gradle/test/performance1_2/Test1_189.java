package org.gradle.test.performance1_2;

import static org.junit.Assert.*;

public class Test1_189 {
    private final Production1_189 production = new Production1_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}