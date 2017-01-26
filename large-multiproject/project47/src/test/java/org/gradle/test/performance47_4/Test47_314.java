package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_314 {
    private final Production47_314 production = new Production47_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}