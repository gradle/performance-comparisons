package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_314 {
    private final Production35_314 production = new Production35_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}