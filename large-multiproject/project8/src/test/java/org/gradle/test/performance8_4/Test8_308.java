package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_308 {
    private final Production8_308 production = new Production8_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}