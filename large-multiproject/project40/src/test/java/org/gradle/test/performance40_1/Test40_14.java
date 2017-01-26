package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_14 {
    private final Production40_14 production = new Production40_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}