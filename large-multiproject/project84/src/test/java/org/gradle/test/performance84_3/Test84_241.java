package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_241 {
    private final Production84_241 production = new Production84_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}