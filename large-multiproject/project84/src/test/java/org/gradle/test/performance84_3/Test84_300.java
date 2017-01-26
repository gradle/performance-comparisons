package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_300 {
    private final Production84_300 production = new Production84_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}