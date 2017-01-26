package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_183 {
    private final Production12_183 production = new Production12_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}