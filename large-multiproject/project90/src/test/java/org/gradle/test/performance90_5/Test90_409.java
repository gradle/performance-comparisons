package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_409 {
    private final Production90_409 production = new Production90_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}