package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_323 {
    private final Production12_323 production = new Production12_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}