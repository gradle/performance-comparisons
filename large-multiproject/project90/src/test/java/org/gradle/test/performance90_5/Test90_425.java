package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_425 {
    private final Production90_425 production = new Production90_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}