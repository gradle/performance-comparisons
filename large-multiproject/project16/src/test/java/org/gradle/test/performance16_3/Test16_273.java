package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_273 {
    private final Production16_273 production = new Production16_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}