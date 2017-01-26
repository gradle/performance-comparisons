package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_211 {
    private final Production46_211 production = new Production46_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}