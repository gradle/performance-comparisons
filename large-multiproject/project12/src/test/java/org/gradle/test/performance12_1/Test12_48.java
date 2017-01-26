package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_48 {
    private final Production12_48 production = new Production12_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}