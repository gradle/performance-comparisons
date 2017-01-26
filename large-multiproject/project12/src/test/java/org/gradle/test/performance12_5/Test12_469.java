package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_469 {
    private final Production12_469 production = new Production12_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}