package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_414 {
    private final Production90_414 production = new Production90_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}