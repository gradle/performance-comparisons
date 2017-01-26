package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_358 {
    private final Production12_358 production = new Production12_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}