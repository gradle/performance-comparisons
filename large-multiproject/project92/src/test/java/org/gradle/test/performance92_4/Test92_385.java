package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_385 {
    private final Production92_385 production = new Production92_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}