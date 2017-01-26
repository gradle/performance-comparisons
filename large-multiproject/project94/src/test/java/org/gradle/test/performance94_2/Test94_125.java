package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_125 {
    private final Production94_125 production = new Production94_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}