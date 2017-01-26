package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_441 {
    private final Production26_441 production = new Production26_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}