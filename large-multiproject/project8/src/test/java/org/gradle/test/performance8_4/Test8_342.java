package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_342 {
    private final Production8_342 production = new Production8_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}