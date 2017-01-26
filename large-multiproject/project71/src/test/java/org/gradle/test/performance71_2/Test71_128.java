package org.gradle.test.performance71_2;

import static org.junit.Assert.*;

public class Test71_128 {
    private final Production71_128 production = new Production71_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}