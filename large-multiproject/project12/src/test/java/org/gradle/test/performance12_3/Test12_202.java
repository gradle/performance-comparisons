package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_202 {
    private final Production12_202 production = new Production12_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}