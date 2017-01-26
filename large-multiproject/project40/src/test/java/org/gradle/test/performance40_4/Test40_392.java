package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_392 {
    private final Production40_392 production = new Production40_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}