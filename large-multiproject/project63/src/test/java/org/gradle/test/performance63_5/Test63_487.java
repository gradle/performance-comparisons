package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_487 {
    private final Production63_487 production = new Production63_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}