package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_173 {
    private final Production84_173 production = new Production84_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}