package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_442 {
    private final Production84_442 production = new Production84_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}