package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_286 {
    private final Production40_286 production = new Production40_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}