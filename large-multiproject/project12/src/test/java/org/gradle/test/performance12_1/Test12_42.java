package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_42 {
    private final Production12_42 production = new Production12_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}