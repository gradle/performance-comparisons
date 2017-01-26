package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_22 {
    private final Production94_22 production = new Production94_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}