package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_154 {
    private final Production12_154 production = new Production12_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}