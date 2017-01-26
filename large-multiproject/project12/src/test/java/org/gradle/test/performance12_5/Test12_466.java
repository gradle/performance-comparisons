package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_466 {
    private final Production12_466 production = new Production12_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}