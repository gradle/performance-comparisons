package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_408 {
    private final Production39_408 production = new Production39_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}