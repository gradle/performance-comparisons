package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_257 {
    private final Production12_257 production = new Production12_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}