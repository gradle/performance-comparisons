package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_419 {
    private final Production90_419 production = new Production90_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}