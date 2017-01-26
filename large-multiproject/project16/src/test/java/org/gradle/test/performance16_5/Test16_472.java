package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_472 {
    private final Production16_472 production = new Production16_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}