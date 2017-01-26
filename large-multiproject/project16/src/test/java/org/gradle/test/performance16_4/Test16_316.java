package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_316 {
    private final Production16_316 production = new Production16_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}