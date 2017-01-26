package org.gradle.test.performance12_2;

import static org.junit.Assert.*;

public class Test12_191 {
    private final Production12_191 production = new Production12_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}