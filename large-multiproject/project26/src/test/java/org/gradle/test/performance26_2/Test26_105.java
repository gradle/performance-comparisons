package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_105 {
    private final Production26_105 production = new Production26_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}