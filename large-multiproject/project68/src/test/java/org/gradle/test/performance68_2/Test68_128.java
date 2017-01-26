package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_128 {
    private final Production68_128 production = new Production68_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}