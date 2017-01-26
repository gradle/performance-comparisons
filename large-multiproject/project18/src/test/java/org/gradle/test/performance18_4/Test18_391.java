package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_391 {
    private final Production18_391 production = new Production18_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}