package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_471 {
    private final Production12_471 production = new Production12_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}