package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_497 {
    private final Production12_497 production = new Production12_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}