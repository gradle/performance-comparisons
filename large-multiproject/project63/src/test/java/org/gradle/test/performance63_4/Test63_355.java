package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_355 {
    private final Production63_355 production = new Production63_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}