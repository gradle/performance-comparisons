package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_109 {
    private final Production12_109 production = new Production12_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}