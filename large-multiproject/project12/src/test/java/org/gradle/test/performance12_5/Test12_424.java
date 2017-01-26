package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_424 {
    private final Production12_424 production = new Production12_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}