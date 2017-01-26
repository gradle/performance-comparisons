package org.gradle.test.performance24_4;

import static org.junit.Assert.*;

public class Test24_336 {
    private final Production24_336 production = new Production24_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}