package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_474 {
    private final Production84_474 production = new Production84_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}