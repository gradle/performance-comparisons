package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_11 {
    private final Production8_11 production = new Production8_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}