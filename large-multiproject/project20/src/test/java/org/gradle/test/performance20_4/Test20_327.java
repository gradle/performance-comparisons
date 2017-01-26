package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_327 {
    private final Production20_327 production = new Production20_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}