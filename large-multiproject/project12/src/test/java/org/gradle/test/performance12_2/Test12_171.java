package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_171 {
    private final Production12_171 production = new Production12_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}