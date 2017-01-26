package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_435 {
    private final Production12_435 production = new Production12_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}