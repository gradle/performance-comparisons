package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_20 {
    private final Production26_20 production = new Production26_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}