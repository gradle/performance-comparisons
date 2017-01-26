package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_35 {
    private final Production12_35 production = new Production12_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}