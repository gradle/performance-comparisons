package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_108 {
    private final Production8_108 production = new Production8_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}