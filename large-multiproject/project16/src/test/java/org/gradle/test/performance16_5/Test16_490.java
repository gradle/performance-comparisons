package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_490 {
    private final Production16_490 production = new Production16_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}