package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_314 {
    private final Production98_314 production = new Production98_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}