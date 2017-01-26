package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_486 {
    private final Production90_486 production = new Production90_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}