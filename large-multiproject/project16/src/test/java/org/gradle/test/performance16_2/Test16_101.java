package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_101 {
    private final Production16_101 production = new Production16_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}