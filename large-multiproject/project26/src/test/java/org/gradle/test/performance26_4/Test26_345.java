package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_345 {
    private final Production26_345 production = new Production26_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}