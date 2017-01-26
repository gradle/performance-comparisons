package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_437 {
    private final Production12_437 production = new Production12_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}