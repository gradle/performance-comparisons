package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_484 {
    private final Production12_484 production = new Production12_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}