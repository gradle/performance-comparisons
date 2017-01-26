package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_314 {
    private final Production93_314 production = new Production93_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}