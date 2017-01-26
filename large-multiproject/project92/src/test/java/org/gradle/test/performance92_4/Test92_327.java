package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_327 {
    private final Production92_327 production = new Production92_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}