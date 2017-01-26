package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_457 {
    private final Production12_457 production = new Production12_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}