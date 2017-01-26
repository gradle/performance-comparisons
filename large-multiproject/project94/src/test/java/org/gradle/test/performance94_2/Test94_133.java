package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_133 {
    private final Production94_133 production = new Production94_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}