package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_50 {
    private final Production16_50 production = new Production16_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}