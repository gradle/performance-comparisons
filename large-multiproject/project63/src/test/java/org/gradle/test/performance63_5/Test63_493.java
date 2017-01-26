package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_493 {
    private final Production63_493 production = new Production63_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}