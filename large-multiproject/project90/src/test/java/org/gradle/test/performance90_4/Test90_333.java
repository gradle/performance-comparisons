package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_333 {
    private final Production90_333 production = new Production90_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}