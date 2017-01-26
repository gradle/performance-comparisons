package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_169 {
    private final Production8_169 production = new Production8_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}