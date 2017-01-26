package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_412 {
    private final Production8_412 production = new Production8_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}