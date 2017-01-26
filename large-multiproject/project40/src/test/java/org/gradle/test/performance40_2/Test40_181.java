package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_181 {
    private final Production40_181 production = new Production40_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}