package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_194 {
    private final Production18_194 production = new Production18_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}