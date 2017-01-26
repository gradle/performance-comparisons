package org.gradle.test.performance66_4;

import static org.junit.Assert.*;

public class Test66_314 {
    private final Production66_314 production = new Production66_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}