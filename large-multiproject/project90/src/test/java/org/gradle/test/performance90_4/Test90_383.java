package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_383 {
    private final Production90_383 production = new Production90_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}