package org.gradle.test.performance75_2;

import static org.junit.Assert.*;

public class Test75_163 {
    private final Production75_163 production = new Production75_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}