package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_420 {
    private final Production3_420 production = new Production3_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}