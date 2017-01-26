package org.gradle.test.performance63_4;

import static org.junit.Assert.*;

public class Test63_385 {
    private final Production63_385 production = new Production63_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}