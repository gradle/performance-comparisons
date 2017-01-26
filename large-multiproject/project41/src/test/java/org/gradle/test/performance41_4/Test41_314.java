package org.gradle.test.performance41_4;

import static org.junit.Assert.*;

public class Test41_314 {
    private final Production41_314 production = new Production41_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}