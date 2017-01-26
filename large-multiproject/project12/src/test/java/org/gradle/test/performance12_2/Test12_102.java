package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_102 {
    private final Production12_102 production = new Production12_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}