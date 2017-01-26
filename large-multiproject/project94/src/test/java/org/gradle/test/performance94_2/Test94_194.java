package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_194 {
    private final Production94_194 production = new Production94_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}