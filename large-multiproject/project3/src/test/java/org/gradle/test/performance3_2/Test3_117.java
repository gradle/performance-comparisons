package org.gradle.test.performance3_2;

import static org.junit.Assert.*;

public class Test3_117 {
    private final Production3_117 production = new Production3_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}