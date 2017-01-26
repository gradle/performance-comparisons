package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_425 {
    private final Production75_425 production = new Production75_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}