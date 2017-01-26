package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_229 {
    private final Production12_229 production = new Production12_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}