package org.gradle.test.performance26_2;

import static org.junit.Assert.*;

public class Test26_164 {
    private final Production26_164 production = new Production26_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}