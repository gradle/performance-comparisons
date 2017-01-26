package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_189 {
    private final Production3_189 production = new Production3_189("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}