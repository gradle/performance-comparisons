package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_334 {
    private final Production94_334 production = new Production94_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}