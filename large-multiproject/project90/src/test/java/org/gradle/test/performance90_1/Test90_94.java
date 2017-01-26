package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_94 {
    private final Production90_94 production = new Production90_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}