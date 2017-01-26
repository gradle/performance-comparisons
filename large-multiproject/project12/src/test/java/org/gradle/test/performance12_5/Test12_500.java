package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_500 {
    private final Production12_500 production = new Production12_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}