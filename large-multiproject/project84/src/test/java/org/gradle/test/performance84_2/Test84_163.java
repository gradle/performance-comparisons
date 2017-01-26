package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_163 {
    private final Production84_163 production = new Production84_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}