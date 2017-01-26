package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_115 {
    private final Production8_115 production = new Production8_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}