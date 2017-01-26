package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_252 {
    private final Production26_252 production = new Production26_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}