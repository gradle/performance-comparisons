package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_293 {
    private final Production40_293 production = new Production40_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}