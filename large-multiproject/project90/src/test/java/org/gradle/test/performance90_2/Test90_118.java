package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_118 {
    private final Production90_118 production = new Production90_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}