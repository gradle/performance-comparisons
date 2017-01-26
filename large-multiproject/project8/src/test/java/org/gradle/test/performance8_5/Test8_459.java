package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_459 {
    private final Production8_459 production = new Production8_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}