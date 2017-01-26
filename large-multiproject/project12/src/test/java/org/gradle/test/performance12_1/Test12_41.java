package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_41 {
    private final Production12_41 production = new Production12_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}