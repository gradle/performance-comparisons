package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_74 {
    private final Production12_74 production = new Production12_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}