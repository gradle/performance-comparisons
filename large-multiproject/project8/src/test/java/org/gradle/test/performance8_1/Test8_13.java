package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_13 {
    private final Production8_13 production = new Production8_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}