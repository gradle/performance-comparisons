package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_281 {
    private final Production12_281 production = new Production12_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}