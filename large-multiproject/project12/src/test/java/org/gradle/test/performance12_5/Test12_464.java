package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_464 {
    private final Production12_464 production = new Production12_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}