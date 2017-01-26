package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_89 {
    private final Production12_89 production = new Production12_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}