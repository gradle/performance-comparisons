package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_408 {
    private final Production99_408 production = new Production99_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}