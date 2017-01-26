package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_327 {
    private final Production63_327 production = new Production63_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}