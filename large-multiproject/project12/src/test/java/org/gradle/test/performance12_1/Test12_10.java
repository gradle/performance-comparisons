package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_10 {
    private final Production12_10 production = new Production12_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}