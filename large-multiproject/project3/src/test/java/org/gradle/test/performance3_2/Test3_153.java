package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_153 {
    private final Production3_153 production = new Production3_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}