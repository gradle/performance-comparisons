package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_285 {
    private final Production94_285 production = new Production94_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}