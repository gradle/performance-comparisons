package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_417 {
    private final Production12_417 production = new Production12_417("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}