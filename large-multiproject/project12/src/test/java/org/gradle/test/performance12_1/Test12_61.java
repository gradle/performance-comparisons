package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_61 {
    private final Production12_61 production = new Production12_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}