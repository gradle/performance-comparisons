package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_314 {
    private final Production80_314 production = new Production80_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}