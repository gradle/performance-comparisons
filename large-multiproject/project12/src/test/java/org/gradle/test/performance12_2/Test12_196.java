package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_196 {
    private final Production12_196 production = new Production12_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}