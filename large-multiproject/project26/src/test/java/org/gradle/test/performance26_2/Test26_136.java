package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_136 {
    private final Production26_136 production = new Production26_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}