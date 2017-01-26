package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_453 {
    private final Production94_453 production = new Production94_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}