package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_62 {
    private final Production12_62 production = new Production12_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}