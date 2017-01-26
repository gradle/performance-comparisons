package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_401 {
    private final Production12_401 production = new Production12_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}