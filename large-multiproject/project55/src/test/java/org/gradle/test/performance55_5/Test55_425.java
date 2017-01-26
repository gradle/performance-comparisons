package org.gradle.test.performance55_5;

import static org.junit.Assert.*;

public class Test55_425 {
    private final Production55_425 production = new Production55_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}