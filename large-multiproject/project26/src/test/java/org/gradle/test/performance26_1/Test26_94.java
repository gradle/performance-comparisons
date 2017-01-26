package org.gradle.test.performance26_1;

import static org.junit.Assert.*;

public class Test26_94 {
    private final Production26_94 production = new Production26_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}