package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_425 {
    private final Production80_425 production = new Production80_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}