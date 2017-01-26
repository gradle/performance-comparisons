package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_248 {
    private final Production94_248 production = new Production94_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}