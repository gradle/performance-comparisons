package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_44 {
    private final Production12_44 production = new Production12_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}