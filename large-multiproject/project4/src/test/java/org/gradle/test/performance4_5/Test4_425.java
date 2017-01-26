package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_425 {
    private final Production4_425 production = new Production4_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}