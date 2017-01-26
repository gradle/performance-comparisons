package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_283 {
    private final Production12_283 production = new Production12_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}