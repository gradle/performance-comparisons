package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_422 {
    private final Production12_422 production = new Production12_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}