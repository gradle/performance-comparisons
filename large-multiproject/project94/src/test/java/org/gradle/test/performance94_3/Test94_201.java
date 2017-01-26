package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_201 {
    private final Production94_201 production = new Production94_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}