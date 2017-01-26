package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_459 {
    private final Production90_459 production = new Production90_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}