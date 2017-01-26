package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_246 {
    private final Production12_246 production = new Production12_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}