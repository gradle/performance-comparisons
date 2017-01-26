package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_164 {
    private final Production90_164 production = new Production90_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}