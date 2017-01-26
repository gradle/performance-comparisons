package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_314 {
    private final Production86_314 production = new Production86_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}