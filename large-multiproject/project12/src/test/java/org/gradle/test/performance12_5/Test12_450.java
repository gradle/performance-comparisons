package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_450 {
    private final Production12_450 production = new Production12_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}