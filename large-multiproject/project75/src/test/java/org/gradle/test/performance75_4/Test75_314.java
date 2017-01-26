package org.gradle.test.performance75_4;

import static org.junit.Assert.*;

public class Test75_314 {
    private final Production75_314 production = new Production75_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}