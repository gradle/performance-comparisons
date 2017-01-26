package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_408 {
    private final Production37_408 production = new Production37_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}