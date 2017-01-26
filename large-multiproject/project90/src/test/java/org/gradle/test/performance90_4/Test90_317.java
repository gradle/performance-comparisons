package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_317 {
    private final Production90_317 production = new Production90_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}