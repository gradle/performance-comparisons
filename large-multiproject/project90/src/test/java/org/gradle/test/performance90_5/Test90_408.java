package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_408 {
    private final Production90_408 production = new Production90_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}