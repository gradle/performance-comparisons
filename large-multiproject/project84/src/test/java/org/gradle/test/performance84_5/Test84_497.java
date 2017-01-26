package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_497 {
    private final Production84_497 production = new Production84_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}