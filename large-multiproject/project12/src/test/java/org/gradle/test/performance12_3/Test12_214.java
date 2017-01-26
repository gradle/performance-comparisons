package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_214 {
    private final Production12_214 production = new Production12_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}