package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_127 {
    private final Production26_127 production = new Production26_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}