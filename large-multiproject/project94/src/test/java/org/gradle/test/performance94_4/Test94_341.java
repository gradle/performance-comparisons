package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_341 {
    private final Production94_341 production = new Production94_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}