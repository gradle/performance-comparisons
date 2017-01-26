package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_125 {
    private final Production90_125 production = new Production90_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}