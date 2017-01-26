package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_426 {
    private final Production12_426 production = new Production12_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}