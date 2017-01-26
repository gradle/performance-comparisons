package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_9 {
    private final Production12_9 production = new Production12_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}