package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_266 {
    private final Production12_266 production = new Production12_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}