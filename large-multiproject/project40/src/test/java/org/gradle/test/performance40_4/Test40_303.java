package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_303 {
    private final Production40_303 production = new Production40_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}