package org.gradle.test.performance3_4;

import static org.junit.Assert.*;

public class Test3_319 {
    private final Production3_319 production = new Production3_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}