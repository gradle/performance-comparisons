package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_336 {
    private final Production90_336 production = new Production90_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}