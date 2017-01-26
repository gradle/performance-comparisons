package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_275 {
    private final Production94_275 production = new Production94_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}