package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_241 {
    private final Production12_241 production = new Production12_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}