package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_407 {
    private final Production90_407 production = new Production90_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}