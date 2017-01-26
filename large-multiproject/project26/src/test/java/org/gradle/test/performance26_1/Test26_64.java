package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_64 {
    private final Production26_64 production = new Production26_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}