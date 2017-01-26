package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_256 {
    private final Production8_256 production = new Production8_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}