package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_252 {
    private final Production90_252 production = new Production90_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}