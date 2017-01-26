package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_314 {
    private final Production48_314 production = new Production48_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}