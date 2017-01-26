package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_399 {
    private final Production16_399 production = new Production16_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}