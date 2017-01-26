package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_134 {
    private final Production40_134 production = new Production40_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}