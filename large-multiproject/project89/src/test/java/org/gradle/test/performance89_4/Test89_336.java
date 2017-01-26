package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_336 {
    private final Production89_336 production = new Production89_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}