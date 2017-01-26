package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_128 {
    private final Production52_128 production = new Production52_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}