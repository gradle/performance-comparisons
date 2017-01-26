package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_221 {
    private final Production90_221 production = new Production90_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}