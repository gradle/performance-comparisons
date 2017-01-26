package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_83 {
    private final Production12_83 production = new Production12_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}