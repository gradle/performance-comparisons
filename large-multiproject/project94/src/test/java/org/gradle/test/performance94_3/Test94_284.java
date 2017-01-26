package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_284 {
    private final Production94_284 production = new Production94_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}