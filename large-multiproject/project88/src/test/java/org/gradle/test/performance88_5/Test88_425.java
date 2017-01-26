package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_425 {
    private final Production88_425 production = new Production88_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}