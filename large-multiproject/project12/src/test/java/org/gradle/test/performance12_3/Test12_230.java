package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_230 {
    private final Production12_230 production = new Production12_230("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}