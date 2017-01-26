package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_187 {
    private final Production26_187 production = new Production26_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}