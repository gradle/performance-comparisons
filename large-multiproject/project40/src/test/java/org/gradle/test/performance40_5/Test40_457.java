package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_457 {
    private final Production40_457 production = new Production40_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}