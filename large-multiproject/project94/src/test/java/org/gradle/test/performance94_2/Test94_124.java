package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_124 {
    private final Production94_124 production = new Production94_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}