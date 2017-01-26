package org.gradle.test.performance34_2;

import static org.junit.Assert.*;

public class Test34_128 {
    private final Production34_128 production = new Production34_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}