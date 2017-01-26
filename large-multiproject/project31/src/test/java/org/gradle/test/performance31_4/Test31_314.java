package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_314 {
    private final Production31_314 production = new Production31_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}