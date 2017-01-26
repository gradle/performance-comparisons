package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_359 {
    private final Production94_359 production = new Production94_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}