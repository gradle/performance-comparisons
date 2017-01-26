package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_165 {
    private final Production90_165 production = new Production90_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}