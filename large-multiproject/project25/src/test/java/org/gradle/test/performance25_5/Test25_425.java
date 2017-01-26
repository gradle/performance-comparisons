package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_425 {
    private final Production25_425 production = new Production25_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}