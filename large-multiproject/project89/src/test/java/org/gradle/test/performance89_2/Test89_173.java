package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_173 {
    private final Production89_173 production = new Production89_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}