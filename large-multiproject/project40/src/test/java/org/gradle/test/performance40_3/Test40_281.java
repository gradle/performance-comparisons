package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_281 {
    private final Production40_281 production = new Production40_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}