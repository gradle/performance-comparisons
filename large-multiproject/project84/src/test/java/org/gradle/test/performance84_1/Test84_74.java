package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_74 {
    private final Production84_74 production = new Production84_74("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}