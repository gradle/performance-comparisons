package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_301 {
    private final Production8_301 production = new Production8_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}