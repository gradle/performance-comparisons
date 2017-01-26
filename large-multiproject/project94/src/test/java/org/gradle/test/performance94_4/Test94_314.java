package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_314 {
    private final Production94_314 production = new Production94_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}