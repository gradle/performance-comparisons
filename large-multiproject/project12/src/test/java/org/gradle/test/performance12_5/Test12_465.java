package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_465 {
    private final Production12_465 production = new Production12_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}