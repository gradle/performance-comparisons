package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_425 {
    private final Production98_425 production = new Production98_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}