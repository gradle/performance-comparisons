package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_107 {
    private final Production12_107 production = new Production12_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}