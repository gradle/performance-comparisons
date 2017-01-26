package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_288 {
    private final Production12_288 production = new Production12_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}