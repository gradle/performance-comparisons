package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_297 {
    private final Production12_297 production = new Production12_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}