package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_385 {
    private final Production18_385 production = new Production18_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}