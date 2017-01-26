package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_443 {
    private final Production16_443 production = new Production16_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}