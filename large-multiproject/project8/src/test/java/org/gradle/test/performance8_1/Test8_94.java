package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_94 {
    private final Production8_94 production = new Production8_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}