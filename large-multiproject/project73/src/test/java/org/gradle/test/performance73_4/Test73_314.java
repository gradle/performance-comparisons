package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_314 {
    private final Production73_314 production = new Production73_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}