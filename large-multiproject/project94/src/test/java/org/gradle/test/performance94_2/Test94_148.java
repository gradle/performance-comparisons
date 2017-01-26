package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_148 {
    private final Production94_148 production = new Production94_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}