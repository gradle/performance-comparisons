package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_384 {
    private final Production8_384 production = new Production8_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}