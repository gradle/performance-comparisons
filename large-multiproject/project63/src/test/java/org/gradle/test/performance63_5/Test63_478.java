package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_478 {
    private final Production63_478 production = new Production63_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}