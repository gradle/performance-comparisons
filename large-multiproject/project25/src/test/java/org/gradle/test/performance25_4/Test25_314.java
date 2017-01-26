package org.gradle.test.performance25_4;

import static org.junit.Assert.*;

public class Test25_314 {
    private final Production25_314 production = new Production25_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}