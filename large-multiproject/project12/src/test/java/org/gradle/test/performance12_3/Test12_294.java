package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_294 {
    private final Production12_294 production = new Production12_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}