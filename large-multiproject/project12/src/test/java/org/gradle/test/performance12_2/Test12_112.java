package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_112 {
    private final Production12_112 production = new Production12_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}