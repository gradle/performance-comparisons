package org.gradle.test.performance26_3;

import static org.junit.Assert.*;

public class Test26_218 {
    private final Production26_218 production = new Production26_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}