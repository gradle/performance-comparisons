package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_266 {
    private final Production84_266 production = new Production84_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}