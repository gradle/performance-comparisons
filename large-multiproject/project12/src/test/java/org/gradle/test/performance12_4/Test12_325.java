package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_325 {
    private final Production12_325 production = new Production12_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}