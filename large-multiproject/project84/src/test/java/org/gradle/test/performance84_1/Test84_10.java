package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_10 {
    private final Production84_10 production = new Production84_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}