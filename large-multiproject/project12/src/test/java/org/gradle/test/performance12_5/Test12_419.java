package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_419 {
    private final Production12_419 production = new Production12_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}