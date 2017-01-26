package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_187 {
    private final Production8_187 production = new Production8_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}