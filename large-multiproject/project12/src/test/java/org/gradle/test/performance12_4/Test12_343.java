package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_343 {
    private final Production12_343 production = new Production12_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}