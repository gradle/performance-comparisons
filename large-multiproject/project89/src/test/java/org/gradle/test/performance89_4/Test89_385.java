package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_385 {
    private final Production89_385 production = new Production89_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}