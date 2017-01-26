package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_337 {
    private final Production12_337 production = new Production12_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}