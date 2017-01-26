package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_478 {
    private final Production3_478 production = new Production3_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}