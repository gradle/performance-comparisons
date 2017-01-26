package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_385 {
    private final Production4_385 production = new Production4_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}