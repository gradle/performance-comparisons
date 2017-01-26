package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_128 {
    private final Production19_128 production = new Production19_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}