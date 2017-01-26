package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_143 {
    private final Production8_143 production = new Production8_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}