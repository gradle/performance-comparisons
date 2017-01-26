package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_308 {
    private final Production26_308 production = new Production26_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}