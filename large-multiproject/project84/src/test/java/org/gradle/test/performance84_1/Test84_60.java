package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_60 {
    private final Production84_60 production = new Production84_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}