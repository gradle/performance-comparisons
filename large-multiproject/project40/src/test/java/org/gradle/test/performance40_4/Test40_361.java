package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_361 {
    private final Production40_361 production = new Production40_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}