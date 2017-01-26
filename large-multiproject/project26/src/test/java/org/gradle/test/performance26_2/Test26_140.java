package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_140 {
    private final Production26_140 production = new Production26_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}