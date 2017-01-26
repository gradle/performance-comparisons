package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_138 {
    private final Production12_138 production = new Production12_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}