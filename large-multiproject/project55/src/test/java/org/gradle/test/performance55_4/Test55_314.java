package org.gradle.test.performance55_4;

import static org.junit.Assert.*;

public class Test55_314 {
    private final Production55_314 production = new Production55_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}