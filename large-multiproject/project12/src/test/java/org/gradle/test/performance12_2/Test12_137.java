package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_137 {
    private final Production12_137 production = new Production12_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}