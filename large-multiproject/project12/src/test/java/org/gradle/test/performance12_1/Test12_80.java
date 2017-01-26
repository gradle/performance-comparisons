package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_80 {
    private final Production12_80 production = new Production12_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}