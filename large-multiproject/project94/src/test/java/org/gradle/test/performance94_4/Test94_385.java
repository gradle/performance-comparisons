package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_385 {
    private final Production94_385 production = new Production94_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}