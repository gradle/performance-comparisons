package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_314 {
    private final Production37_314 production = new Production37_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}