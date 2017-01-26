package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_275 {
    private final Production90_275 production = new Production90_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}