package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_495 {
    private final Production12_495 production = new Production12_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}