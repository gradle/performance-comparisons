package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_206 {
    private final Production90_206 production = new Production90_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}