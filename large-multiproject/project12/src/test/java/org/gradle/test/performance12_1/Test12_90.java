package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_90 {
    private final Production12_90 production = new Production12_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}