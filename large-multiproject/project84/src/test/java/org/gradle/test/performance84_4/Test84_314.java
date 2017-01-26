package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_314 {
    private final Production84_314 production = new Production84_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}