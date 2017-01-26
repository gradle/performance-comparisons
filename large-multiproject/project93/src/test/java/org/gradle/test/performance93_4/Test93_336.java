package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_336 {
    private final Production93_336 production = new Production93_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}