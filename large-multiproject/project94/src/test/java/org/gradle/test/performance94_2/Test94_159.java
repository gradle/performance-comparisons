package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_159 {
    private final Production94_159 production = new Production94_159("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}