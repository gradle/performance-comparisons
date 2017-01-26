package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_231 {
    private final Production12_231 production = new Production12_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}