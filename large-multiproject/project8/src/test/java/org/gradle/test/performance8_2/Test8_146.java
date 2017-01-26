package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_146 {
    private final Production8_146 production = new Production8_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}