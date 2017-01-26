package org.gradle.test.performance12_4;

import static org.junit.Assert.*;

public class Test12_331 {
    private final Production12_331 production = new Production12_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}