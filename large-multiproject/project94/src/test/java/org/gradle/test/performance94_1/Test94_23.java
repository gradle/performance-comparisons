package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_23 {
    private final Production94_23 production = new Production94_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}