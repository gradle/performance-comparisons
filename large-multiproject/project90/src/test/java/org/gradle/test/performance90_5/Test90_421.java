package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_421 {
    private final Production90_421 production = new Production90_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}