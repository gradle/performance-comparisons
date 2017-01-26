package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_469 {
    private final Production26_469 production = new Production26_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}