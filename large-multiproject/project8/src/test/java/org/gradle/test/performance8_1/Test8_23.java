package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_23 {
    private final Production8_23 production = new Production8_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}