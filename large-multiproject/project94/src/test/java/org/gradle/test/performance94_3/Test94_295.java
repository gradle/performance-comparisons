package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_295 {
    private final Production94_295 production = new Production94_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}