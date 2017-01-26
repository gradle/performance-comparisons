package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_245 {
    private final Production3_245 production = new Production3_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}