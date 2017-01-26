package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_259 {
    private final Production12_259 production = new Production12_259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}