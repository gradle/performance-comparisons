package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_212 {
    private final Production84_212 production = new Production84_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}