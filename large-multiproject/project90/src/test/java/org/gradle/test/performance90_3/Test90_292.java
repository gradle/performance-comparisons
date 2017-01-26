package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_292 {
    private final Production90_292 production = new Production90_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}