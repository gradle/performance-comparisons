package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_32 {
    private final Production8_32 production = new Production8_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}