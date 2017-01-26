package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_173 {
    private final Production20_173 production = new Production20_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}