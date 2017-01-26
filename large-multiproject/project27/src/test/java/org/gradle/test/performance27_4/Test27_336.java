package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_336 {
    private final Production27_336 production = new Production27_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}