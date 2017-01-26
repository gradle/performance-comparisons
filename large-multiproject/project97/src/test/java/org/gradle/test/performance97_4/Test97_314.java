package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_314 {
    private final Production97_314 production = new Production97_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}