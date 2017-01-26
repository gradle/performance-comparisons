package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_178 {
    private final Production94_178 production = new Production94_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}