package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_323 {
    private final Production84_323 production = new Production84_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}