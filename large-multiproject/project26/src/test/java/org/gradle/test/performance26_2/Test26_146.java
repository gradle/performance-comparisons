package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_146 {
    private final Production26_146 production = new Production26_146("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}