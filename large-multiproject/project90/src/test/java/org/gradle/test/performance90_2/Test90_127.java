package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_127 {
    private final Production90_127 production = new Production90_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}