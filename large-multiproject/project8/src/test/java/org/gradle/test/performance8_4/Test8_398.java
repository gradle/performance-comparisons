package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_398 {
    private final Production8_398 production = new Production8_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}