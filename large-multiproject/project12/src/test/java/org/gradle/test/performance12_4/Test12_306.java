package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_306 {
    private final Production12_306 production = new Production12_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}