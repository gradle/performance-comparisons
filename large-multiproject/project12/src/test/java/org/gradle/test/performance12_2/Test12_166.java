package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_166 {
    private final Production12_166 production = new Production12_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}