package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_340 {
    private final Production90_340 production = new Production90_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}