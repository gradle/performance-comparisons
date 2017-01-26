package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_238 {
    private final Production12_238 production = new Production12_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}