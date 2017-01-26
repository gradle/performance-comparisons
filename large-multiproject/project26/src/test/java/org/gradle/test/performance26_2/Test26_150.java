package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_150 {
    private final Production26_150 production = new Production26_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}