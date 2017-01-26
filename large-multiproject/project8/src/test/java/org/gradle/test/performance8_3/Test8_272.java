package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_272 {
    private final Production8_272 production = new Production8_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}