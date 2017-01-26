package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_232 {
    private final Production16_232 production = new Production16_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}