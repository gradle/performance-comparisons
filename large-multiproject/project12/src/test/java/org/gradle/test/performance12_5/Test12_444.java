package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_444 {
    private final Production12_444 production = new Production12_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}