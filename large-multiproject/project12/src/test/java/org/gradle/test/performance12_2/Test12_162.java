package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_162 {
    private final Production12_162 production = new Production12_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}