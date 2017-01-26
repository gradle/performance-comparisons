package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_349 {
    private final Production8_349 production = new Production8_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}