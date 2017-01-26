package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_382 {
    private final Production40_382 production = new Production40_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}