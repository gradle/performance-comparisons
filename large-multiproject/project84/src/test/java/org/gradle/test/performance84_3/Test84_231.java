package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_231 {
    private final Production84_231 production = new Production84_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}