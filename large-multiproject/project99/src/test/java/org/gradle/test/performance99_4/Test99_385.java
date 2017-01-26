package org.gradle.test.performance99_4;

import static org.junit.Assert.*;

public class Test99_385 {
    private final Production99_385 production = new Production99_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}