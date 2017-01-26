package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_240 {
    private final Production8_240 production = new Production8_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}