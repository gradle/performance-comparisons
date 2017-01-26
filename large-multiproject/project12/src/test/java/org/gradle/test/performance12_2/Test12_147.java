package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_147 {
    private final Production12_147 production = new Production12_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}