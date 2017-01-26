package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_442 {
    private final Production12_442 production = new Production12_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}