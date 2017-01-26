package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_228 {
    private final Production12_228 production = new Production12_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}