package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_173 {
    private final Production58_173 production = new Production58_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}