package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_275 {
    private final Production8_275 production = new Production8_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}