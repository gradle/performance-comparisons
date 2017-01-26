package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_344 {
    private final Production94_344 production = new Production94_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}