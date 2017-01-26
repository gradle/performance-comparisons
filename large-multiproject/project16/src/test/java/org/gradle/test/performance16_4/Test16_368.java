package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_368 {
    private final Production16_368 production = new Production16_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}