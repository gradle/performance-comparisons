package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_204 {
    private final Production12_204 production = new Production12_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}