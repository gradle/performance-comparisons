package org.gradle.test.performance17_2;

import static org.junit.Assert.*;

public class Test17_128 {
    private final Production17_128 production = new Production17_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}