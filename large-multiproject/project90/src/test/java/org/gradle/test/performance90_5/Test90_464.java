package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_464 {
    private final Production90_464 production = new Production90_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}