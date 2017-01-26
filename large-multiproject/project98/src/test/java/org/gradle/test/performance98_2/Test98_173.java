package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_173 {
    private final Production98_173 production = new Production98_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}