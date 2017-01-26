package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_477 {
    private final Production90_477 production = new Production90_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}