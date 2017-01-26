package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_217 {
    private final Production8_217 production = new Production8_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}