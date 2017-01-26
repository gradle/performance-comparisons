package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_305 {
    private final Production40_305 production = new Production40_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}