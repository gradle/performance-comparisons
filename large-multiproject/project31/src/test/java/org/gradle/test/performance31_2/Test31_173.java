package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_173 {
    private final Production31_173 production = new Production31_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}