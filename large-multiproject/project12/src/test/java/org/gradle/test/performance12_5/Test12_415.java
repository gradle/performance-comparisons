package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_415 {
    private final Production12_415 production = new Production12_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}