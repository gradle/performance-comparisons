package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_238 {
    private final Production84_238 production = new Production84_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}