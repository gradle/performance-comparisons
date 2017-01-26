package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_329 {
    private final Production12_329 production = new Production12_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}