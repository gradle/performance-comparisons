package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_128 {
    private final Production42_128 production = new Production42_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}