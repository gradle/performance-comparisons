package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_287 {
    private final Production94_287 production = new Production94_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}