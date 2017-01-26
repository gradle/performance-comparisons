package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_286 {
    private final Production12_286 production = new Production12_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}