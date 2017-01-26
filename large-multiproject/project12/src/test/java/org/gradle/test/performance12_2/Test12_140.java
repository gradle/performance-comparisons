package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_140 {
    private final Production12_140 production = new Production12_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}