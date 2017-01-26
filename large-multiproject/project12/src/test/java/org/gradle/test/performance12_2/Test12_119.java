package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_119 {
    private final Production12_119 production = new Production12_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}