package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_350 {
    private final Production40_350 production = new Production40_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}