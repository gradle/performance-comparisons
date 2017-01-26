package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_305 {
    private final Production12_305 production = new Production12_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}