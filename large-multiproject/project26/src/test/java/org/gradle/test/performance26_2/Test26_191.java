package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_191 {
    private final Production26_191 production = new Production26_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}