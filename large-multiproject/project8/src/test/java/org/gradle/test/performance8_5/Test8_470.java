package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_470 {
    private final Production8_470 production = new Production8_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}