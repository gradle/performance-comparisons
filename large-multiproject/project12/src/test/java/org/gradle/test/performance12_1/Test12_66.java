package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_66 {
    private final Production12_66 production = new Production12_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}