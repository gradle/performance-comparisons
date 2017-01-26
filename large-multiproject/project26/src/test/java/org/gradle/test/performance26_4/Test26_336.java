package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_336 {
    private final Production26_336 production = new Production26_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}