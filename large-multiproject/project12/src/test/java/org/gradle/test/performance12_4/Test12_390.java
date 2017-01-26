package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_390 {
    private final Production12_390 production = new Production12_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}