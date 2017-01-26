package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_32 {
    private final Production26_32 production = new Production26_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}