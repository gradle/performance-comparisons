package org.gradle.test.performance36_2;

import static org.junit.Assert.*;

public class Test36_128 {
    private final Production36_128 production = new Production36_128("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}