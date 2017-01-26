package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_33 {
    private final Production84_33 production = new Production84_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}