package org.gradle.test.performance12_3;

import static org.junit.Assert.*;

public class Test12_209 {
    private final Production12_209 production = new Production12_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}