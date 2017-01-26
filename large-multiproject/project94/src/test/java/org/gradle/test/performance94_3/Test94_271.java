package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_271 {
    private final Production94_271 production = new Production94_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}