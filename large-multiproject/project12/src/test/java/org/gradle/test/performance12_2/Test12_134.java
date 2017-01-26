package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_134 {
    private final Production12_134 production = new Production12_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}