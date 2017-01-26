package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_357 {
    private final Production94_357 production = new Production94_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}