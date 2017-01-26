package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_148 {
    private final Production8_148 production = new Production8_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}