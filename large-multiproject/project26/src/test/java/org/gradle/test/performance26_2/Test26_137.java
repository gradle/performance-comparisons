package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_137 {
    private final Production26_137 production = new Production26_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}