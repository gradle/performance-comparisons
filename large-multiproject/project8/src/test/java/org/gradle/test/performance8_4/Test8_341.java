package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_341 {
    private final Production8_341 production = new Production8_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}