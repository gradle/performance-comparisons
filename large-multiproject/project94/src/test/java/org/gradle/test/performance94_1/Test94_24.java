package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_24 {
    private final Production94_24 production = new Production94_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}