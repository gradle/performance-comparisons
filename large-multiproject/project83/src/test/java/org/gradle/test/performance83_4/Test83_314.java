package org.gradle.test.performance83_4;

import static org.junit.Assert.*;

public class Test83_314 {
    private final Production83_314 production = new Production83_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}