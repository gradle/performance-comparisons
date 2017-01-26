package org.gradle.test.performance90_2;

import static org.junit.Assert.*;

public class Test90_179 {
    private final Production90_179 production = new Production90_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}