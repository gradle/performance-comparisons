package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_213 {
    private final Production8_213 production = new Production8_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}