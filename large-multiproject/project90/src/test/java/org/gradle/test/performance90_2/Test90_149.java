package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_149 {
    private final Production90_149 production = new Production90_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}