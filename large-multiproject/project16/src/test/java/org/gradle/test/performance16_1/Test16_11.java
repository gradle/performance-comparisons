package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_11 {
    private final Production16_11 production = new Production16_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}