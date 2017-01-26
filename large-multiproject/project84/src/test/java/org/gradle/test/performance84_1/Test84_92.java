package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_92 {
    private final Production84_92 production = new Production84_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}