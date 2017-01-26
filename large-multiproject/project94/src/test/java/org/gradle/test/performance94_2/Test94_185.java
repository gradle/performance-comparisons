package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_185 {
    private final Production94_185 production = new Production94_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}