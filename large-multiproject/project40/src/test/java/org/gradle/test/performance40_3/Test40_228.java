package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_228 {
    private final Production40_228 production = new Production40_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}