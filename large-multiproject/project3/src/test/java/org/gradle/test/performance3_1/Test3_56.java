package org.gradle.test.performance3_1;

import static org.junit.Assert.*;

public class Test3_56 {
    private final Production3_56 production = new Production3_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}