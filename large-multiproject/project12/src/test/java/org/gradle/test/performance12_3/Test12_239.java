package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_239 {
    private final Production12_239 production = new Production12_239("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}