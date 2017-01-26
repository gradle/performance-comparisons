package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_160 {
    private final Production26_160 production = new Production26_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}