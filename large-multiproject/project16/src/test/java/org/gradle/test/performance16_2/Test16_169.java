package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_169 {
    private final Production16_169 production = new Production16_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}