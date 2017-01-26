package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_163 {
    private final Production26_163 production = new Production26_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}