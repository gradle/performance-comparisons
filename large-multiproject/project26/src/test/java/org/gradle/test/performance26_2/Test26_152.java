package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_152 {
    private final Production26_152 production = new Production26_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}