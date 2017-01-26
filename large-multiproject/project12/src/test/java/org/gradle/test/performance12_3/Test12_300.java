package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_300 {
    private final Production12_300 production = new Production12_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}