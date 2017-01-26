package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_213 {
    private final Production26_213 production = new Production26_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}