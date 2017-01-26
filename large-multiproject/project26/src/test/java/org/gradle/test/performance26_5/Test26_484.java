package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_484 {
    private final Production26_484 production = new Production26_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}