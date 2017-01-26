package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_314 {
    private final Production20_314 production = new Production20_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}