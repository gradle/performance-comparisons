package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_220 {
    private final Production12_220 production = new Production12_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}