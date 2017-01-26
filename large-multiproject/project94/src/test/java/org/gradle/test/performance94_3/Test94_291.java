package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_291 {
    private final Production94_291 production = new Production94_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}