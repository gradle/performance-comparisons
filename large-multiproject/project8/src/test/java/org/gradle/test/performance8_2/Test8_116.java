package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_116 {
    private final Production8_116 production = new Production8_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}