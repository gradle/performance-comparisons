package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_280 {
    private final Production94_280 production = new Production94_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}