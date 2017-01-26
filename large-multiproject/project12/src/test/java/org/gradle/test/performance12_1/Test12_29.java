package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_29 {
    private final Production12_29 production = new Production12_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}