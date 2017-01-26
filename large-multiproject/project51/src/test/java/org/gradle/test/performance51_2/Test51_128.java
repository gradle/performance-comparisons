package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_128 {
    private final Production51_128 production = new Production51_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}