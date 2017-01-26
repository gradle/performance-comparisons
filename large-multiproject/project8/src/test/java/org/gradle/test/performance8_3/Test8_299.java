package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_299 {
    private final Production8_299 production = new Production8_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}