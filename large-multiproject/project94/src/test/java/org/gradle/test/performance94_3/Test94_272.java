package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_272 {
    private final Production94_272 production = new Production94_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}