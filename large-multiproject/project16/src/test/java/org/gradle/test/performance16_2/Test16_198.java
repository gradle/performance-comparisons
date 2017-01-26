package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_198 {
    private final Production16_198 production = new Production16_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}