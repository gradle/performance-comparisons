package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_182 {
    private final Production12_182 production = new Production12_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}