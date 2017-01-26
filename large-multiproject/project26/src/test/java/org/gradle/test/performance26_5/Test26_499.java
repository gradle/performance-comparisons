package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_499 {
    private final Production26_499 production = new Production26_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}