package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_480 {
    private final Production8_480 production = new Production8_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}