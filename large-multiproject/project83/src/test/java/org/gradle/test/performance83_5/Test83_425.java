package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_425 {
    private final Production83_425 production = new Production83_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}