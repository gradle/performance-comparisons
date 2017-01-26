package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_173 {
    private final Production92_173 production = new Production92_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}