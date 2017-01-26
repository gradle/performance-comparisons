package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_173 {
    private final Production80_173 production = new Production80_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}