package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_186 {
    private final Production12_186 production = new Production12_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}