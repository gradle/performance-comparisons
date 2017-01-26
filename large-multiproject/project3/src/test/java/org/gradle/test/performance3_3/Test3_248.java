package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_248 {
    private final Production3_248 production = new Production3_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}