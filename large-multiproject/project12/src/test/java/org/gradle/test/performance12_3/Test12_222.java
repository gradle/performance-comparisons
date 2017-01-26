package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_222 {
    private final Production12_222 production = new Production12_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}