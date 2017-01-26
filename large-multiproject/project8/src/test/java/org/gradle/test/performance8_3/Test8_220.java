package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_220 {
    private final Production8_220 production = new Production8_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}