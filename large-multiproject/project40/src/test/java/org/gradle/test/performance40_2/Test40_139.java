package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_139 {
    private final Production40_139 production = new Production40_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}