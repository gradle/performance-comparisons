package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_32 {
    private final Production94_32 production = new Production94_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}