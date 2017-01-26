package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_135 {
    private final Production12_135 production = new Production12_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}