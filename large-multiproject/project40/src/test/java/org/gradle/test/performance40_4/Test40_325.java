package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_325 {
    private final Production40_325 production = new Production40_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}