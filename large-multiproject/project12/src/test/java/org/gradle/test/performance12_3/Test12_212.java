package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_212 {
    private final Production12_212 production = new Production12_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}