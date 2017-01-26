package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_181 {
    private final Production12_181 production = new Production12_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}