package org.gradle.test.performance62_4;

import static org.junit.Assert.*;

public class Test62_336 {
    private final Production62_336 production = new Production62_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}