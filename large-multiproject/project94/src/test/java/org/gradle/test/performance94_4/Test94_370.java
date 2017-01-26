package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_370 {
    private final Production94_370 production = new Production94_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}