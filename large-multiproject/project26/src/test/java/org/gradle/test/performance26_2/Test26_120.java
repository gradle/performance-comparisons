package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_120 {
    private final Production26_120 production = new Production26_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}