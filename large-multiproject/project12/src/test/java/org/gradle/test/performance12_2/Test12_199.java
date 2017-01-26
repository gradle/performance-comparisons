package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_199 {
    private final Production12_199 production = new Production12_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}