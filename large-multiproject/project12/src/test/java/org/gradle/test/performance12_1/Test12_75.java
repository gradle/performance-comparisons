package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_75 {
    private final Production12_75 production = new Production12_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}