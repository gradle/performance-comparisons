package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_385 {
    private final Production14_385 production = new Production14_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}