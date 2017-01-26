package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_232 {
    private final Production8_232 production = new Production8_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}