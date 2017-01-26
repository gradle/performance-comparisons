package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_450 {
    private final Production84_450 production = new Production84_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}