package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_268 {
    private final Production12_268 production = new Production12_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}