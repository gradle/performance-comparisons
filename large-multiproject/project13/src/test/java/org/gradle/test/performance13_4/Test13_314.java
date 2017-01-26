package org.gradle.test.performance13_4;

import static org.junit.Assert.*;

public class Test13_314 {
    private final Production13_314 production = new Production13_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}