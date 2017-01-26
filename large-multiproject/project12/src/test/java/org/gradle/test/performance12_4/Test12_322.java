package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_322 {
    private final Production12_322 production = new Production12_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}