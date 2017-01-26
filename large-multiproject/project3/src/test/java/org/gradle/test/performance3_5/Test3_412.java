package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_412 {
    private final Production3_412 production = new Production3_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}