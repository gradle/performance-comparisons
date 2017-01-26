package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_202 {
    private final Production40_202 production = new Production40_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}