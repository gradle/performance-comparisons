package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_297 {
    private final Production40_297 production = new Production40_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}