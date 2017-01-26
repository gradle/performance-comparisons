package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_244 {
    private final Production8_244 production = new Production8_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}