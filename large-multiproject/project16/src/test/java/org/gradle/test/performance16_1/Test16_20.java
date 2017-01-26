package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_20 {
    private final Production16_20 production = new Production16_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}