package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_201 {
    private final Production26_201 production = new Production26_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}