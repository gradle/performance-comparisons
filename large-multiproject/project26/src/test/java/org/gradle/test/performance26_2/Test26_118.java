package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_118 {
    private final Production26_118 production = new Production26_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}