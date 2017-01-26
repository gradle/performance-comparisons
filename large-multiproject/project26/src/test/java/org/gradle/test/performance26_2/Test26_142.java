package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_142 {
    private final Production26_142 production = new Production26_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}