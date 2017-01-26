package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_327 {
    private final Production94_327 production = new Production94_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}