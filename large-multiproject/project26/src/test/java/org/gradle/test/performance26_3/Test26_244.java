package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_244 {
    private final Production26_244 production = new Production26_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}