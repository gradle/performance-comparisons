package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_382 {
    private final Production12_382 production = new Production12_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}