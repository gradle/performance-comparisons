package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_177 {
    private final Production26_177 production = new Production26_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}