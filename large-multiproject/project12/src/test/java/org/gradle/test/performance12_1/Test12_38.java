package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_38 {
    private final Production12_38 production = new Production12_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}