package org.gradle.test.performance4_2;

import static org.junit.Assert.*;

public class Test4_173 {
    private final Production4_173 production = new Production4_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}