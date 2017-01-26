package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_289 {
    private final Production12_289 production = new Production12_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}