package org.gradle.test.performance12_1;

import static org.junit.Assert.*;

public class Test12_97 {
    private final Production12_97 production = new Production12_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}