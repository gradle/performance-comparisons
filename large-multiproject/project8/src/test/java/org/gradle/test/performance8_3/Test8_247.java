package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_247 {
    private final Production8_247 production = new Production8_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}