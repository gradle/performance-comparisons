package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_387 {
    private final Production90_387 production = new Production90_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}