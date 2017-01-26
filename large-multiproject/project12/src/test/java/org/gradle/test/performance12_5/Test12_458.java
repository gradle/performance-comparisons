package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_458 {
    private final Production12_458 production = new Production12_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}