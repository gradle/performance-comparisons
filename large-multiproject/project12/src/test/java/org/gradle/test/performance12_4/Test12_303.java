package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_303 {
    private final Production12_303 production = new Production12_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}