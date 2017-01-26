package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_314 {
    private final Production40_314 production = new Production40_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}