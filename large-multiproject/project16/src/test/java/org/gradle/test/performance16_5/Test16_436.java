package org.gradle.test.performance16_5;

import static org.junit.Assert.*;

public class Test16_436 {
    private final Production16_436 production = new Production16_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}