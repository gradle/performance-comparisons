package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_258 {
    private final Production16_258 production = new Production16_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}