package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_69 {
    private final Production8_69 production = new Production8_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}