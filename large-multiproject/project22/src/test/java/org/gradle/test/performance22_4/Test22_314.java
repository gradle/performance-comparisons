package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_314 {
    private final Production22_314 production = new Production22_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}