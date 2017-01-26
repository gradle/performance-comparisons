package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_491 {
    private final Production94_491 production = new Production94_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}