package org.gradle.test.performance66_2;

import static org.junit.Assert.*;

public class Test66_128 {
    private final Production66_128 production = new Production66_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}