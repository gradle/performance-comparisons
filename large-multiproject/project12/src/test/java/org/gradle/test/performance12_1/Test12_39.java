package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_39 {
    private final Production12_39 production = new Production12_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}