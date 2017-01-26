package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_413 {
    private final Production94_413 production = new Production94_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}