package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_314 {
    private final Production54_314 production = new Production54_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}