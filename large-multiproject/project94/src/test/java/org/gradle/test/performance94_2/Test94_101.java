package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_101 {
    private final Production94_101 production = new Production94_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}