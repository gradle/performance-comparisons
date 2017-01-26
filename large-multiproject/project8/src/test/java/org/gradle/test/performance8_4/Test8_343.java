package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_343 {
    private final Production8_343 production = new Production8_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}