package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_91 {
    private final Production12_91 production = new Production12_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}