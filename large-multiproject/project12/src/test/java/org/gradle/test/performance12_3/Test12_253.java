package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_253 {
    private final Production12_253 production = new Production12_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}