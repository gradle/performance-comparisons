package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_240 {
    private final Production3_240 production = new Production3_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}