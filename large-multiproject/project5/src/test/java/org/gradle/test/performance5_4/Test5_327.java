package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_327 {
    private final Production5_327 production = new Production5_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}