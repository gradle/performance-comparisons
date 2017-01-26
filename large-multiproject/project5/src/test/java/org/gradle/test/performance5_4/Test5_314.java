package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_314 {
    private final Production5_314 production = new Production5_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}