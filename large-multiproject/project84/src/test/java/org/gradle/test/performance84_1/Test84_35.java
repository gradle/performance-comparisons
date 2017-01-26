package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_35 {
    private final Production84_35 production = new Production84_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}