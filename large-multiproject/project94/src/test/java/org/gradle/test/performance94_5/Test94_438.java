package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_438 {
    private final Production94_438 production = new Production94_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}