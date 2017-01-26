package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_425 {
    private final Production39_425 production = new Production39_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}