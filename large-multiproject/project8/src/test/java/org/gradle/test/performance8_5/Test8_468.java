package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_468 {
    private final Production8_468 production = new Production8_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}