package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_175 {
    private final Production40_175 production = new Production40_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}