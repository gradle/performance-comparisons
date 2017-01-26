package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_425 {
    private final Production84_425 production = new Production84_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}