package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_224 {
    private final Production94_224 production = new Production94_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}