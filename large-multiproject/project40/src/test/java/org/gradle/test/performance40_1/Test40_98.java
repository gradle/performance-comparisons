package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_98 {
    private final Production40_98 production = new Production40_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}