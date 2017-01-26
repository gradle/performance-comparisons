package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_356 {
    private final Production40_356 production = new Production40_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}