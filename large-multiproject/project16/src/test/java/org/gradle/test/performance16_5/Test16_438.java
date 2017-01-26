package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_438 {
    private final Production16_438 production = new Production16_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}