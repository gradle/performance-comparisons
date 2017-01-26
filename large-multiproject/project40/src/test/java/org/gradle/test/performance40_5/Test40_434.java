package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_434 {
    private final Production40_434 production = new Production40_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}