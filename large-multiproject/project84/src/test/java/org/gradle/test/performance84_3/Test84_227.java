package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_227 {
    private final Production84_227 production = new Production84_227("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}