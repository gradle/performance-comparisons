package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_4 {
    private final Production12_4 production = new Production12_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}