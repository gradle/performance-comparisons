package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_271 {
    private final Production16_271 production = new Production16_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}