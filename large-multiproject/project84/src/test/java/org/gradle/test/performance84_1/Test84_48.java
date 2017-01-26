package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_48 {
    private final Production84_48 production = new Production84_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}