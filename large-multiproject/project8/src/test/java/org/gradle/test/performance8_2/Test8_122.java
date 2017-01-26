package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_122 {
    private final Production8_122 production = new Production8_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}