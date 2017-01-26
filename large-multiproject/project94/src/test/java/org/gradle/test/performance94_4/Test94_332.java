package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_332 {
    private final Production94_332 production = new Production94_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}