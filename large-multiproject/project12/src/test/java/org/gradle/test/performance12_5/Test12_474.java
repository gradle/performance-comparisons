package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_474 {
    private final Production12_474 production = new Production12_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}