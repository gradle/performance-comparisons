package org.gradle.test.performance81_2;

import static org.junit.Assert.*;

public class Test81_128 {
    private final Production81_128 production = new Production81_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}