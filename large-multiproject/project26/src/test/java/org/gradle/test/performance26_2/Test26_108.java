package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_108 {
    private final Production26_108 production = new Production26_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}