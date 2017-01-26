package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_180 {
    private final Production26_180 production = new Production26_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}