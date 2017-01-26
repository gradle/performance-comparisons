package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_240 {
    private final Production94_240 production = new Production94_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}