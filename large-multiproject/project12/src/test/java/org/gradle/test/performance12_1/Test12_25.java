package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_25 {
    private final Production12_25 production = new Production12_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}