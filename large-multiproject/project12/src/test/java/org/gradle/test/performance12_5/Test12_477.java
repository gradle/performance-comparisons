package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_477 {
    private final Production12_477 production = new Production12_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}