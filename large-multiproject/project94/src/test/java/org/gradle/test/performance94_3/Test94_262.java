package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_262 {
    private final Production94_262 production = new Production94_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}