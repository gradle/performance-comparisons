package org.gradle.test.performance26_4;

import static org.junit.Assert.*;

public class Test26_377 {
    private final Production26_377 production = new Production26_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}