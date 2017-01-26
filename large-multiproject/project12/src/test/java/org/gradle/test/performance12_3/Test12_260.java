package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_260 {
    private final Production12_260 production = new Production12_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}