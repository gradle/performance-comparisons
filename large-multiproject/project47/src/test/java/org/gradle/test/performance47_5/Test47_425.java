package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_425 {
    private final Production47_425 production = new Production47_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}