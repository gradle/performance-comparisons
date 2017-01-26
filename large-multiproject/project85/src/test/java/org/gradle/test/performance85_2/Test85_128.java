package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_128 {
    private final Production85_128 production = new Production85_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}