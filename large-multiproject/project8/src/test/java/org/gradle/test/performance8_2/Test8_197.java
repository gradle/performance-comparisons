package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_197 {
    private final Production8_197 production = new Production8_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}