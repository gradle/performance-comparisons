package org.gradle.test.performance43_4;

import static org.junit.Assert.*;

public class Test43_314 {
    private final Production43_314 production = new Production43_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}