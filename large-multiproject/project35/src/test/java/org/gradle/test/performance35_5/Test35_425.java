package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_425 {
    private final Production35_425 production = new Production35_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}