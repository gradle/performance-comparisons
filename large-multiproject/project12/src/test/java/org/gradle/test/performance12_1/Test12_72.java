package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_72 {
    private final Production12_72 production = new Production12_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}