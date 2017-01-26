package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_332 {
    private final Production16_332 production = new Production16_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}