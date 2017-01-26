package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_173 {
    private final Production26_173 production = new Production26_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}