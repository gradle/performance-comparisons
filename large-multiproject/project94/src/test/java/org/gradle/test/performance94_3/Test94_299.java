package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_299 {
    private final Production94_299 production = new Production94_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}