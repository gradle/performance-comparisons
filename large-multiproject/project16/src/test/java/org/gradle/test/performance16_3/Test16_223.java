package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_223 {
    private final Production16_223 production = new Production16_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}