package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_79 {
    private final Production8_79 production = new Production8_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}