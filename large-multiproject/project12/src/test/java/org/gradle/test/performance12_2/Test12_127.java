package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_127 {
    private final Production12_127 production = new Production12_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}