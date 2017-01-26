package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_237 {
    private final Production16_237 production = new Production16_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}