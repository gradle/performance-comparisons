package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_350 {
    private final Production84_350 production = new Production84_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}