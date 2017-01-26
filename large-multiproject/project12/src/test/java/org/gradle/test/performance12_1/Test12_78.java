package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_78 {
    private final Production12_78 production = new Production12_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}