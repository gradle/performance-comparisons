package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_183 {
    private final Production84_183 production = new Production84_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}