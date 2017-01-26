package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_88 {
    private final Production12_88 production = new Production12_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}