package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_287 {
    private final Production26_287 production = new Production26_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}