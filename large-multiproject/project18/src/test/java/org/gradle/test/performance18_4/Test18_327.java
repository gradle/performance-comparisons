package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_327 {
    private final Production18_327 production = new Production18_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}