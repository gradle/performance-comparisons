package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_408 {
    private final Production43_408 production = new Production43_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}