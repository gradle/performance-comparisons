package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_136 {
    private final Production8_136 production = new Production8_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}