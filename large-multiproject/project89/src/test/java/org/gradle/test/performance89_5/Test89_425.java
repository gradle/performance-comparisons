package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_425 {
    private final Production89_425 production = new Production89_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}