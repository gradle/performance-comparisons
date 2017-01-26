package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_125 {
    private final Production8_125 production = new Production8_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}