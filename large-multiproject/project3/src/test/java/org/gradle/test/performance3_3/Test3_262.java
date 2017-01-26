package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_262 {
    private final Production3_262 production = new Production3_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}