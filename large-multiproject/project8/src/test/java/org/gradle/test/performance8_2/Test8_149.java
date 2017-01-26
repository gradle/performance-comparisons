package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_149 {
    private final Production8_149 production = new Production8_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}