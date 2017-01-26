package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_251 {
    private final Production84_251 production = new Production84_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}