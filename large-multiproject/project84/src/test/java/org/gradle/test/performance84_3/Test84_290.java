package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_290 {
    private final Production84_290 production = new Production84_290("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}