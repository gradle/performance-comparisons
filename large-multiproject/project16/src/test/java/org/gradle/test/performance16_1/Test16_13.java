package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_13 {
    private final Production16_13 production = new Production16_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}