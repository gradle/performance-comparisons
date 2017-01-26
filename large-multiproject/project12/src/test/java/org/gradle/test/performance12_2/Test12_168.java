package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_168 {
    private final Production12_168 production = new Production12_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}