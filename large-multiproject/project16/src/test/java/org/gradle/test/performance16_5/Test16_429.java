package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_429 {
    private final Production16_429 production = new Production16_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}