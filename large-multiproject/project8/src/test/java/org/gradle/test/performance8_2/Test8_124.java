package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_124 {
    private final Production8_124 production = new Production8_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}