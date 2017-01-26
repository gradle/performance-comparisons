package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_129 {
    private final Production8_129 production = new Production8_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}