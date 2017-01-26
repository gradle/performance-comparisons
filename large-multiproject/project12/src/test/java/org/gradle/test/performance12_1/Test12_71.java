package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_71 {
    private final Production12_71 production = new Production12_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}