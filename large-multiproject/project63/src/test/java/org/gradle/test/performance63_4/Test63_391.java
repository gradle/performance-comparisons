package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_391 {
    private final Production63_391 production = new Production63_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}