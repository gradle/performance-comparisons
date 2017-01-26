package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_51 {
    private final Production12_51 production = new Production12_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}