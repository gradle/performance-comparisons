package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_311 {
    private final Production8_311 production = new Production8_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}