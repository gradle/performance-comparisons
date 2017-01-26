package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_427 {
    private final Production84_427 production = new Production84_427("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}