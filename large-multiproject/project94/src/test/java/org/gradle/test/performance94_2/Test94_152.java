package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_152 {
    private final Production94_152 production = new Production94_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}