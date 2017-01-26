package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_93 {
    private final Production12_93 production = new Production12_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}