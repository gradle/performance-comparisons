package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_251 {
    private final Production12_251 production = new Production12_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}