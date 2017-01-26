package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_276 {
    private final Production94_276 production = new Production94_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}