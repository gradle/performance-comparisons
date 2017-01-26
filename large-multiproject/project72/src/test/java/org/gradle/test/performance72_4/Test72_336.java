package org.gradle.test.performance72_4;

import static org.junit.Assert.*;

public class Test72_336 {
    private final Production72_336 production = new Production72_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}