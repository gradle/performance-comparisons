package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_401 {
    private final Production90_401 production = new Production90_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}