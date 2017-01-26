package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_362 {
    private final Production12_362 production = new Production12_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}