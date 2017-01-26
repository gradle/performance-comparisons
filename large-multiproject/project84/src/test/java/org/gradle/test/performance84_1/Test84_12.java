package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_12 {
    private final Production84_12 production = new Production84_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}