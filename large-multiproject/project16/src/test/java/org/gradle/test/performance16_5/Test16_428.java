package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_428 {
    private final Production16_428 production = new Production16_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}