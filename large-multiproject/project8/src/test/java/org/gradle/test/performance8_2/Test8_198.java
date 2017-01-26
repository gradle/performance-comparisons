package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_198 {
    private final Production8_198 production = new Production8_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}