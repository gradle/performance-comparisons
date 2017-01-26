package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_214 {
    private final Production84_214 production = new Production84_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}