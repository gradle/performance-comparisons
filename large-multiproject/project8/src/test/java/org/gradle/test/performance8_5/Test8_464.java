package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_464 {
    private final Production8_464 production = new Production8_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}