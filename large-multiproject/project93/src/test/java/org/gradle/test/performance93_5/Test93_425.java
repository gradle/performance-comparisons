package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_425 {
    private final Production93_425 production = new Production93_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}