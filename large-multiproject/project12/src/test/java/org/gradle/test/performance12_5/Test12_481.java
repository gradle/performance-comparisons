package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_481 {
    private final Production12_481 production = new Production12_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}