package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_298 {
    private final Production8_298 production = new Production8_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}