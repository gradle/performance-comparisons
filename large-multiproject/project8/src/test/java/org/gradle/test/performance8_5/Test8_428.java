package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_428 {
    private final Production8_428 production = new Production8_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}