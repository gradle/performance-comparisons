package org.gradle.test.performance12_5;

import static org.junit.Assert.*;

public class Test12_434 {
    private final Production12_434 production = new Production12_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}