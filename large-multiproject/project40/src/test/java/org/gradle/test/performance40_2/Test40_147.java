package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_147 {
    private final Production40_147 production = new Production40_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}