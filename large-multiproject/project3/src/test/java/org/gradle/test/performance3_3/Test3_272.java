package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_272 {
    private final Production3_272 production = new Production3_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}